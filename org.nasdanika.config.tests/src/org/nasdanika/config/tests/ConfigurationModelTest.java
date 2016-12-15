package org.nasdanika.config.tests;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.nasdanika.config.ConfigPackage;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.Context;
import org.nasdanika.config.SimpleMutableContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


public class ConfigurationModelTest {
	
	private Configuration configuration;
	
	@Before
	public void loadModel() {		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		URL testModelURL = bundle.getResource("test-models/test.nsdconf");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(ConfigPackage.eNS_URI, ConfigPackage.eINSTANCE);
		URI uri = URI.createURI(testModelURL.toString());
		Resource resource = resourceSet.getResource(uri, true);
		configuration = (Configuration) resource.getContents().get(0);
	}
	
	@Test
	public void testStringProperty() throws Exception {
		IProgressMonitor progressMonitor = new NullProgressMonitor() {
									
			// Override methods as needed.
			
		};
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, configuration.getConfigWorkSize());
		Context context = configuration.createContext(null, subMonitor);
		assertEquals("testValue", context.get("myStringProperty"));
	}

}
