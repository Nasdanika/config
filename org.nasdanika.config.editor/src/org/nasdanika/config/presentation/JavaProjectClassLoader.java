package org.nasdanika.config.presentation;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;

/**
 * Loads classes from {@link IJavaProject} and referenced libraries and projects.
 * @author Pavel Vlasov
 *
 */
public class JavaProjectClassLoader extends ClassLoader {
	
	private static byte[] read(InputStream is) throws IOException {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int b; 
		while ((b = is.read()) != -1) {
			baos.write(b);
		}
		baos.close();
		return baos.toByteArray();
	}
	
	/**
	 * Finds type in the argument java project and its referenced projects.
	 * @param javaProject
	 * @param fullyQualifiedName
	 * @return
	 * @throws Exception
	 */
	private static IType findType(IJavaProject javaProject, String fullyQualifiedName) throws Exception {
		IType ret = javaProject.findType(fullyQualifiedName);
		if (ret != null) {
			return ret;
		}
		
		IWorkspaceRoot workspaceRoot = javaProject.getProject().getWorkspace().getRoot();
		for (String rpn: javaProject.getRequiredProjectNames()) {
			IProject rp = workspaceRoot.getProject(rpn);
			if (rp != null 
					&& rp.exists() 
					&& rp.isOpen() 
					&& rp.isNatureEnabled(JavaCore.NATURE_ID)) {
				
                ret = findType(JavaCore.create(rp), fullyQualifiedName);
                if (ret != null) {
                	return ret;
                }
			}
        }			
		
		return ret;
	}
	

	/**
	 * Loads resources to memory.
	 */
	private Map<String, byte[]> resourceMap = new ConcurrentHashMap<>();
	
	private IJavaProject javaProject;

	public JavaProjectClassLoader(ClassLoader parent, IJavaProject javaProject) {
		super(parent);
		this.javaProject = javaProject;
	}	
		
	private Class<?> loadArchive(InputStream is, String toFind) throws Exception {
		try {
			Class<?> ret = null;
			try (JarInputStream jis = new JarInputStream(is)) {
	            for (JarEntry inputEntry = jis.getNextJarEntry(); inputEntry!=null; inputEntry = jis.getNextJarEntry()) {
	            	byte[] buf = read(jis);
	        		if (inputEntry.getName().endsWith(".class")) {
	        			Class<?> cls = defineClass(null, buf, 0, buf.length);
	        			if (cls.getName().equals(toFind)) {
	        				ret = cls;
	        			}
	        		} else {
	        			resourceMap.put(inputEntry.getName(), buf);
	        		}
	        		jis.closeEntry();
	            }
			}
			if (ret == null) {
				throw new ClassNotFoundException(toFind);
			}
			return ret;
		} finally {
			is.close();
		}
	}
	
	private Class<?> loadFolder(IResource resource, String parentPath, String toFind) throws Exception {
		Class<?> ret = null;
		if (resource instanceof IFile) {
			byte[] buf = read(((IFile) resource).getContents());
			if (resource.getName().endsWith(".class")) {
    			Class<?> cls = defineClass(null, buf, 0, buf.length);
    			if (cls.getName().equals(toFind)) {
    				ret = cls;
    			}
    		} else {
    			resourceMap.put(parentPath == null ? resource.getName() : parentPath+"/"+resource.getName(), buf);
    		}				
		}
		if (resource instanceof IFolder) {
			String path = parentPath == null ? resource.getName() : parentPath + "/" + resource.getName();
			for (IResource child: ((IFolder) resource).members()) {
				Class<?> cret = loadFolder(child, path, toFind);
				if (cret != null) {
					ret = cret;
				}
			}
		}
		if (ret == null && parentPath == null) {
			throw new ClassNotFoundException(toFind);
		}
		return ret;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {				
		try {
			IType type = findType(javaProject, name);
			if (type == null) {
				throw new ClassNotFoundException("Could not find "+name+" in project "+javaProject.getProject().getName());				
			}
			ICompilationUnit compilationUnit = type.getCompilationUnit();
			IClassFile classFile = type.getClassFile();
			if (compilationUnit != null) {
				IPath outputLocation = compilationUnit.getJavaProject().getOutputLocation();
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IResource resource = root.findMember(outputLocation);
				return loadFolder((IFolder) resource, null, name);
			} 
			
			if (classFile != null) {
				IResource resource = classFile.getResource();
				if (resource == null) {
					throw new ClassNotFoundException("Could not load "+name+" in project "+javaProject.getProject().getName());									
				}
				if (resource.getName().endsWith(".class")) {
					byte[] buf = read(((IFile) resource).getContents());
					return defineClass(null, buf, 0, buf.length);
				}
				return loadArchive(((IFile) resource).getContents(), name);
			}
			
			throw new ClassNotFoundException("Could not find "+name+" in project "+javaProject.getProject().getName());				
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (Exception e) {
			throw new ClassNotFoundException("Could not find "+name+" in project "+javaProject.getProject().getName(), e);
		}
	}
	
	private URLStreamHandler urlStreamHandler = new URLStreamHandler() {
		
		@Override
		protected URLConnection openConnection(URL u) throws IOException {
			return new URLConnection(u) {

				public InputStream getInputStream() throws IOException {
					return new ByteArrayInputStream(resourceMap.get(url.getFile()));
				};
				
				@Override
				public void connect() throws IOException {					
					// NOP
				}				
				
			};
		}
		
	};	
	
	@Override
	protected URL findResource(String name) {
		byte[] buf = resourceMap.get(name);
		if (buf == null) {
			return null;
		}
		
		try {
			return new URL("javaprojectclassloader", String.valueOf(hashCode()), 80, name, urlStreamHandler);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
					
}