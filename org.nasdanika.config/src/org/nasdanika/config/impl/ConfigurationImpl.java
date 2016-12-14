/**
 */
package org.nasdanika.config.impl;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.config.ConfigPackage;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.ConfigurationItem;
import org.nasdanika.config.Context;
import org.nasdanika.config.NamedConfigurationItem;
import org.nasdanika.config.Property;
import org.nasdanika.config.Service;
import org.nasdanika.config.util.ConfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getDefaultIncludes <em>Default Includes</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.config.impl.ConfigurationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends CDOObjectImpl implements Configuration {
	private static final String PROPERTY_PATH_SEPARATOR = "/";


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getIncludes() {
		return (EList<String>)eGet(ConfigPackage.Literals.CONFIGURATION__INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConfigurationItem> getConfiguration() {
		return (EList<ConfigurationItem>)eGet(ConfigPackage.Literals.CONFIGURATION__CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDefaultIncludes() {
		return (EList<String>)eGet(ConfigPackage.Literals.CONFIGURATION__DEFAULT_INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return (String)eGet(ConfigPackage.Literals.CONFIGURATION__BASE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		eSet(ConfigPackage.Literals.CONFIGURATION__BASE_URL, newBaseURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getClassPath() {
		return (EList<String>)eGet(ConfigPackage.Literals.CONFIGURATION__CLASS_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Configuration> getInclude() {
		return (EList<Configuration>)eGet(ConfigPackage.Literals.CONFIGURATION__INCLUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(ConfigPackage.Literals.CONFIGURATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(ConfigPackage.Literals.CONFIGURATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Context createContext(Context parent, SubMonitor monitor) throws Exception {
		monitor.subTask("Loading configuration");
		// Includes
		// TODO - implement
		if (!getIncludes().isEmpty()) {
			throw new UnsupportedOperationException("'includes' is not yet supported, feel free to implement and contribute - https://github.com/Nasdanika/codegen");
		}

		// Include
		for (Configuration inc: getInclude()) {
			parent = inc.createContext(parent, monitor);
		}
		
		// ClassLoader
		URL[] classPathURLs = getClassPath().isEmpty() ? null : new URL[getClassPath().size()];
		for (int i = 0; i < getClassPath().size(); ++i) {
			classPathURLs[i] = new URL(resolveBaseURL(), getClassPath().get(i));
		}
		ClassLoader classLoader = classPathURLs == null ? parent.getClassLoader() : new URLClassLoader(classPathURLs, parent.getClassLoader());
				
		// Configuration items
		Map<String, Object> properties = new HashMap<>();
		Map<String, Object> defaultProperties = new HashMap<>();
		Map<String, Context> subContexts = new LinkedHashMap<>();
		Map<Class<?>, Object> services = new HashMap<>();
		Map<Class<?>, Object> defaultServices = new HashMap<>();
				
		final Context finalParent = parent;
		
		Context ret = new Context() {

			@Override
			public Object get(String name) {
				if (name == null) {
					return null;
				}
				
				// Sub-contexts - only properties or subcontexts themselves.
				for (Entry<String, Context> sce: subContexts.entrySet()) {
					if (name.equals(sce.getKey())) {
						return sce.getValue();
					}
					
					if (name.startsWith(sce.getKey()+PROPERTY_PATH_SEPARATOR)) {
						return sce.getValue().get(name.substring(sce.getKey().length()+PROPERTY_PATH_SEPARATOR.length())); 
					}
				}				
				
				// Properties
				Object ret =  properties.get(name);
				if (ret != null) {
					return ret;
				}
				
				// Parent
				if (finalParent != null) {
					ret = finalParent.get(name);
					if (ret != null) {
						return ret;
					}
				}
				
				// Default properties
				return defaultProperties.get(name);
			}

			@SuppressWarnings("unchecked")
			@Override
			public <T> T get(Class<T> type) {
				// Services
				T ret = (T) services.get(type);
				if (ret != null) {
					return ret;
				}
				
				for (Entry<Class<?>, Object> e: services.entrySet()) {
					if (type.isAssignableFrom(e.getKey())) {
						return (T) e.getValue();
					}
				}
				
				// Parent
				if (finalParent != null) {
					ret = finalParent.get(type);
					if (ret != null) {
						return ret;
					}
				}
				
				// Default services
				ret = (T) defaultServices.get(type);
				if (ret != null) {
					return ret;
				}
				
				for (Entry<Class<?>, Object> e: defaultServices.entrySet()) {
					if (type.isAssignableFrom(e.getKey())) {
						return (T) e.getValue();
					}
				}
				
				return ret;
			}

			@Override
			public ClassLoader getClassLoader() {
				return classLoader;
			}
			
		};
		
		for (ConfigurationItem ci: getConfiguration()) {
			Object obj = ci.get(ret, monitor);
			if (ci instanceof Service) {
				Service service = (Service) ci;
				Class<?> serviceType = classLoader.loadClass(service.getServiceType());
				(service.isDefault() ? defaultServices : services).put(service.getValues().size() > 1 ? Array.newInstance(serviceType, 0).getClass() : serviceType, obj);				
			} else if (ci instanceof Property) {
				Property property = (Property) ci;				
				(property.isDefault() ? defaultProperties : properties).put(property.getName(), obj);								
			} else {
				subContexts.put(((NamedConfigurationItem) ci).getName(), ci.createContext(new Context() {
					
					@Override
					public ClassLoader getClassLoader() {
						return ret.getClassLoader();
					}
					
					@Override
					public <T> T get(Class<T> type) {
						return null;
					}
					
					@Override
					public Object get(String name) {
						return null;
					}
				}, monitor));
			}
		}				
		
		return ret;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (diagnostics != null) {
			if (!getIncludes().isEmpty()) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConfigValidator.DIAGNOSTIC_SOURCE,
						 ConfigValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Includes are not currently supported - feel free to contribute - https://github.com/Nasdanika/codegen",
						 new Object [] { this, ConfigPackage.Literals.CONFIGURATION__INCLUDES }));
				
				result = false;
				
				// TODO - once includes are supported validate extensions - .properties, .json, .yml, .nsdgen - and validate URL's.
			}
			
			if (!getDefaultIncludes().isEmpty()) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConfigValidator.DIAGNOSTIC_SOURCE,
						 ConfigValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Default includes are not currently supported - feel free to contribute - https://github.com/Nasdanika/codegen",
						 new Object [] { this, ConfigPackage.Literals.CONFIGURATION__INCLUDES }));
				
				result = false;
				
				// TODO - once includes are supported validate extensions - .properties, .json, .yml, .nsdgen - and validate URL's.
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getConfigWorkSize() {
		int ret = 0;
		for (ConfigurationItem ci: getConfiguration()) {
			ret += ci.getConfigWorkSize();
		}
		for (Configuration inc: getInclude()) {
			ret += inc.getConfigWorkSize();
		}
		ret += getIncludes().size();
		ret += getDefaultIncludes().size();
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConfigPackage.CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR:
				try {
					return createContext((Context)arguments.get(0), (SubMonitor)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ConfigPackage.CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConfigPackage.CONFIGURATION___GET_CONFIG_WORK_SIZE:
				return getConfigWorkSize();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Resolves base URL
	 * @return
	 * @throws Exception
	 */
	protected URL resolveBaseURL() throws Exception {		
		URL baseURL = null;
		if (eContainer() instanceof ConfigurationImpl) {
			baseURL = ((ConfigurationImpl) eContainer()).resolveBaseURL();
		} else {
			try {
				baseURL = new URL(eResource().getURI().toString());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		if (getBaseURL() != null && getBaseURL().trim().length() > 0) {
			baseURL = new URL(baseURL, getBaseURL());
		}
		return baseURL;
	}
	
} //ConfigurationImpl
