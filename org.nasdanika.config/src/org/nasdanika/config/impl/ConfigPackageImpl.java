/**
 */
package org.nasdanika.config.impl;

import java.util.List;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.config.ConfigFactory;
import org.nasdanika.config.ConfigPackage;
import org.nasdanika.config.Configuration;
import org.nasdanika.config.ConfigurationItem;
import org.nasdanika.config.Context;
import org.nasdanika.config.NamedConfigurationItem;
import org.nasdanika.config.Property;
import org.nasdanika.config.Provider;
import org.nasdanika.config.Service;
import org.nasdanika.config.ValueConfigurationItem;
import org.nasdanika.config.util.ConfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConfigurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedConfigurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subMonitorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConfigPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConfigValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Includes() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Configuration() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_DefaultIncludes() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_BaseURL() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ClassPath() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Include() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Description() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__CreateContext__Context_SubMonitor() {
		return configurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__Validate__DiagnosticChain_Map() {
		return configurationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConfiguration__GetConfigWorkSize() {
		return configurationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationItem() {
		return configurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceType() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConfigurationItem() {
		return valueConfigurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_ValueType() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Values() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Default() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConfigurationItem_Scripted() {
		return (EAttribute)valueConfigurationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedConfigurationItem() {
		return namedConfigurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedConfigurationItem_Name() {
		return (EAttribute)namedConfigurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContext() {
		return contextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubMonitor() {
		return subMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__INCLUDES);
		createEReference(configurationEClass, CONFIGURATION__CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__DEFAULT_INCLUDES);
		createEAttribute(configurationEClass, CONFIGURATION__BASE_URL);
		createEAttribute(configurationEClass, CONFIGURATION__CLASS_PATH);
		createEReference(configurationEClass, CONFIGURATION__INCLUDE);
		createEAttribute(configurationEClass, CONFIGURATION__DESCRIPTION);
		createEOperation(configurationEClass, CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR);
		createEOperation(configurationEClass, CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(configurationEClass, CONFIGURATION___GET_CONFIG_WORK_SIZE);

		configurationItemEClass = createEClass(CONFIGURATION_ITEM);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_TYPE);

		propertyEClass = createEClass(PROPERTY);

		providerEClass = createEClass(PROVIDER);

		valueConfigurationItemEClass = createEClass(VALUE_CONFIGURATION_ITEM);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__VALUE_TYPE);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__VALUES);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__DEFAULT);
		createEAttribute(valueConfigurationItemEClass, VALUE_CONFIGURATION_ITEM__SCRIPTED);

		namedConfigurationItemEClass = createEClass(NAMED_CONFIGURATION_ITEM);
		createEAttribute(namedConfigurationItemEClass, NAMED_CONFIGURATION_ITEM__NAME);

		// Create data types
		contextEDataType = createEDataType(CONTEXT);
		exceptionEDataType = createEDataType(EXCEPTION);
		listEDataType = createEDataType(LIST);
		subMonitorEDataType = createEDataType(SUB_MONITOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(providerEClass, "T");
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getConfiguration());
		configurationItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProvider());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		configurationItemEClass.getEGenericSuperTypes().add(g1);
		serviceEClass.getESuperTypes().add(this.getValueConfigurationItem());
		propertyEClass.getESuperTypes().add(this.getValueConfigurationItem());
		propertyEClass.getESuperTypes().add(this.getNamedConfigurationItem());
		valueConfigurationItemEClass.getESuperTypes().add(this.getConfigurationItem());
		namedConfigurationItemEClass.getESuperTypes().add(this.getConfigurationItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Includes(), ecorePackage.getEString(), "includes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Configuration(), this.getConfigurationItem(), null, "configuration", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_DefaultIncludes(), ecorePackage.getEString(), "defaultIncludes", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ClassPath(), ecorePackage.getEString(), "classPath", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Include(), this.getConfiguration(), null, "include", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getConfiguration__CreateContext__Context_SubMonitor(), this.getContext(), "createContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSubMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getConfiguration__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConfiguration__GetConfigWorkSize(), ecorePackage.getEInt(), "getConfigWorkSize", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configurationItemEClass, ConfigurationItem.class, "ConfigurationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueConfigurationItemEClass, ValueConfigurationItem.class, "ValueConfigurationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueConfigurationItem_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Values(), ecorePackage.getEString(), "values", null, 0, -1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConfigurationItem_Scripted(), ecorePackage.getEBoolean(), "scripted", null, 0, 1, ValueConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedConfigurationItemEClass, NamedConfigurationItem.class, "NamedConfigurationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedConfigurationItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(contextEDataType, Context.class, "Context", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(subMonitorEDataType, SubMonitor.class, "SubMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Code generation model."
		   });	
		addAnnotation
		  (configurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Container of configuration items - properties and services.\r\nGenerators extend configuration. Configuration can also be defined in a standalone model to be provided as input to generators.\r\n"
		   });	
		addAnnotation
		  (getConfiguration__CreateContext__Context_SubMonitor(), 
		   source, 
		   new String[] {
			 "documentation", "Creates ``org.nasdanika.config.Context`` which provides access to properties and services."
		   });	
		addAnnotation
		  ((getConfiguration__CreateContext__Context_SubMonitor()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Parent context."
		   });	
		addAnnotation
		  (getConfiguration__Validate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "documentation", "Validates element for execution/generation. Adds messages to diagnostics and "
		   });	
		addAnnotation
		  ((getConfiguration__Validate__DiagnosticChain_Map()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Diagnostics to add validation messages to."
		   });	
		addAnnotation
		  ((getConfiguration__Validate__DiagnosticChain_Map()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Validation context."
		   });	
		addAnnotation
		  (getConfiguration_Includes(), 
		   source, 
		   new String[] {
			 "documentation", "URL\'s of configuration files to load into the this configurable\'s context.\r\nURL\'s are resolved relative to the ``baseURL``, which in turn is resolved relative to the model resource. \r\n\r\nThe following custom schemes supported:\r\n\r\n* ``bundle`` - ``bundle:<bundle symbolic name>/<resource path in the bundle>``\r\n* ``java`` - ``java:<classloader path>``\r\n\r\nConfiguration files can be in the following formats:\r\n\r\n* XMI model - ``.xml`` or ``.nsdgen`` extension.\r\n* Properties file - ``.properties`` extension.\r\n* JSON file following the structure of the configuration model - ``.json`` extension.\r\n* YAML file following the structure of the configuration model - ``.yml`` extension.\r\n\r\nIf XML/JSON/YAML contains configuration definition, then its ``createContext()`` method is invoked in sequence\r\nto create a chain of contexts. If property or service is contained in the definition, it gets mounted to a context created by this configuration."
		   });	
		addAnnotation
		  (getConfiguration_Configuration(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration items - properties and services."
		   });	
		addAnnotation
		  (getConfiguration_DefaultIncludes(), 
		   source, 
		   new String[] {
			 "documentation", "Same as ``includes``, but default includes are used only if the parent context doesn\'t contain configuration items with requested keys (names or types)."
		   });	
		addAnnotation
		  (getConfiguration_BaseURL(), 
		   source, 
		   new String[] {
			 "documentation", "Base URL to resolve includes, default includes, and classpath entries. \r\nThe URL is resolved relative to the model location and defaults to the model location URL."
		   });	
		addAnnotation
		  (getConfiguration_ClassPath(), 
		   source, 
		   new String[] {
			 "documentation", "Class path for loading classes of configuration elements."
		   });	
		addAnnotation
		  (getConfiguration_Include(), 
		   source, 
		   new String[] {
			 "documentation", "Configurations defined elsewhere to be included into this configuration. \r\nConfigurations get chained and configuration items (properties and services) get\r\nmounted to the context created by this configuration."
		   });	
		addAnnotation
		  (getConfiguration_Description(), 
		   source, 
		   new String[] {
			 "documentation", "Optional description."
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Configuration item contributes to the context of Configurable and can itself be configurable.\r\n"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "documentation", "Service is a configuration item keyed by its type or one of types it implements/extends.\r\n"
		   });	
		addAnnotation
		  (getService_ServiceType(), 
		   source, 
		   new String[] {
			 "documentation", "Service type. Shall be a superclass or implemented interface of the value type.\r\nDefaults to value type."
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "documentation", "Property is a valued configuration item keyed by a String."
		   });	
		addAnnotation
		  (contextEDataType, 
		   source, 
		   new String[] {
			 "documentation", "Context provides access to properties and services. Contexts are typically chained\r\nwith a child context \"inheriting\" properties and services of the parent context(s)."
		   });	
		addAnnotation
		  (providerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Providers are used to create configuration items using given context."
		   });	
		addAnnotation
		  (valueConfigurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Value configuration items can be configured with value in addition to configuration elements.\r\n\r\nIf ``scripted`` is true, the value is evaluated as a script.\r\n\r\nScript is a Java method body returning Object and taking ``Context contect, String valueType`` paramters:\r\n\r\n```java\r\nObject evaluate(Context context, String valueType) throws Exception {\r\n    // --- Script here ---\r\n}\r\n```\r\n\r\nOtherwise, value and configuration items are injected into the configuration item via constructor. An appropriate constructor is selected based on \r\nwhether the value is blank and configuration items are present:\r\n\r\n* Empty values collection - single value object is instantiated with:\r\n  * No configuration items - default constructor or a constructor which takes Context.\r\n  * Configuration items - a constructor which takes Context.\r\n* Non-empty values collection:\r\n  * No configuration items - a constructor which takes String. If value is blank then the default constructor will be considered first, if exists.\r\n  * Configuration items - a constructor which takes String and Context in any order. If value is blank then a constructor which takes Context will be considered first.\r\n\r\nIf configuration item\'s type is assignable from ``org.nasdanika.config.Provider``, then it gets instantiated using\r\neither the default constructor, if it exists and value is blank, or a constructor which takes String. The provider\'s ``get(Context)`` method is used\r\nto obtain actual configuration item.\r\n\r\nIf value is not blank, it is interpolated using properties already defined in the context and inherited from the parent context. \r\nInterpolation is the process of expanding tokens enclosed into double-curly brackets to the values of properties with corresponding names.\r\n\r\nIf a property with a given name is not defined, a token does not get expanded.\r\n\r\nExample:\r\n```\r\n{{base-package}}.impl\r\n```\r\n\r\nIf values size is greater than one, then value is an array with elments of ``valueType``. As such multi-value services are keyed by ``valueType[]`` as opposed to ``valueType`` for single-value or no value services."
		   });	
		addAnnotation
		  (getValueConfigurationItem_ValueType(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration item value type. Defaults to ``java.lang.String``."
		   });	
		addAnnotation
		  (getValueConfigurationItem_Values(), 
		   source, 
		   new String[] {
			 "documentation", "Configuration item values. \r\n"
		   });	
		addAnnotation
		  (getValueConfigurationItem_Default(), 
		   source, 
		   new String[] {
			 "documentation", "Regular configuration shadow/override configuration items defined in parent context(s),\r\ndefault configuration items, on the contrary, get shadowed by parent\'s configuration items\r\nwith the same keys."
		   });	
		addAnnotation
		  (getValueConfigurationItem_Scripted(), 
		   source, 
		   new String[] {
			 "documentation", "If true, value is treated as script and evaluated to compute actual value. \r\n"
		   });	
		addAnnotation
		  (namedConfigurationItemEClass, 
		   source, 
		   new String[] {
			 "documentation", "Named configuration is keyed by a String.\r\n\r\nNamed configuration item is facaded by Context at runtime. Properties of the named configuration item can be accessed using / separator, e.g. ``feature/includedFeatures``."
		   });	
		addAnnotation
		  (getNamedConfigurationItem_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Property name."
		   });
	}

} //ConfigPackageImpl
