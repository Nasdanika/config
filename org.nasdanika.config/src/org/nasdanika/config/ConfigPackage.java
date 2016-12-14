/**
 */
package org.nasdanika.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Code generation model.
 * <!-- end-model-doc -->
 * @see org.nasdanika.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.nasdanika.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.ConfigurationImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INCLUDES = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DEFAULT_INCLUDES = 2;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BASE_URL = 3;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CLASS_PATH = 4;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INCLUDE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___GET_CONFIG_WORK_SIZE = 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.ConfigurationItemImpl <em>Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.ConfigurationItemImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getConfigurationItem()
	 * @generated
	 */
	int CONFIGURATION_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__INCLUDES = CONFIGURATION__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CONFIGURATION = CONFIGURATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__DEFAULT_INCLUDES = CONFIGURATION__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__BASE_URL = CONFIGURATION__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__CLASS_PATH = CONFIGURATION__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__INCLUDE = CONFIGURATION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__DESCRIPTION = CONFIGURATION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP = CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE = CONFIGURATION___GET_CONFIG_WORK_SIZE;

	/**
	 * The number of operations of the '<em>Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.ValueConfigurationItemImpl <em>Value Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.ValueConfigurationItemImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getValueConfigurationItem()
	 * @generated
	 */
	int VALUE_CONFIGURATION_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__INCLUDES = CONFIGURATION_ITEM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__CONFIGURATION = CONFIGURATION_ITEM__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__DEFAULT_INCLUDES = CONFIGURATION_ITEM__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__BASE_URL = CONFIGURATION_ITEM__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__CLASS_PATH = CONFIGURATION_ITEM__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__INCLUDE = CONFIGURATION_ITEM__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__DESCRIPTION = CONFIGURATION_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__VALUE_TYPE = CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__VALUES = CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__DEFAULT = CONFIGURATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scripted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM__SCRIPTED = CONFIGURATION_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Value Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM_FEATURE_COUNT = CONFIGURATION_ITEM_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP = CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE = CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE;

	/**
	 * The number of operations of the '<em>Value Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONFIGURATION_ITEM_OPERATION_COUNT = CONFIGURATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.ServiceImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INCLUDES = VALUE_CONFIGURATION_ITEM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONFIGURATION = VALUE_CONFIGURATION_ITEM__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEFAULT_INCLUDES = VALUE_CONFIGURATION_ITEM__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_URL = VALUE_CONFIGURATION_ITEM__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLASS_PATH = VALUE_CONFIGURATION_ITEM__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INCLUDE = VALUE_CONFIGURATION_ITEM__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = VALUE_CONFIGURATION_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VALUE_TYPE = VALUE_CONFIGURATION_ITEM__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VALUES = VALUE_CONFIGURATION_ITEM__VALUES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEFAULT = VALUE_CONFIGURATION_ITEM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Scripted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SCRIPTED = VALUE_CONFIGURATION_ITEM__SCRIPTED;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_TYPE = VALUE_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = VALUE_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___CREATE_CONTEXT__CONTEXT_SUBMONITOR = VALUE_CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___VALIDATE__DIAGNOSTICCHAIN_MAP = VALUE_CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___GET_CONFIG_WORK_SIZE = VALUE_CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = VALUE_CONFIGURATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.PropertyImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INCLUDES = VALUE_CONFIGURATION_ITEM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CONFIGURATION = VALUE_CONFIGURATION_ITEM__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_INCLUDES = VALUE_CONFIGURATION_ITEM__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BASE_URL = VALUE_CONFIGURATION_ITEM__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS_PATH = VALUE_CONFIGURATION_ITEM__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INCLUDE = VALUE_CONFIGURATION_ITEM__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = VALUE_CONFIGURATION_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE_TYPE = VALUE_CONFIGURATION_ITEM__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUES = VALUE_CONFIGURATION_ITEM__VALUES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = VALUE_CONFIGURATION_ITEM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Scripted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCRIPTED = VALUE_CONFIGURATION_ITEM__SCRIPTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = VALUE_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = VALUE_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CREATE_CONTEXT__CONTEXT_SUBMONITOR = VALUE_CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE__DIAGNOSTICCHAIN_MAP = VALUE_CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_CONFIG_WORK_SIZE = VALUE_CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = VALUE_CONFIGURATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.Provider <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.Provider
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.config.impl.NamedConfigurationItemImpl <em>Named Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.impl.NamedConfigurationItemImpl
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getNamedConfigurationItem()
	 * @generated
	 */
	int NAMED_CONFIGURATION_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__INCLUDES = CONFIGURATION_ITEM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__CONFIGURATION = CONFIGURATION_ITEM__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Default Includes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__DEFAULT_INCLUDES = CONFIGURATION_ITEM__DEFAULT_INCLUDES;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__BASE_URL = CONFIGURATION_ITEM__BASE_URL;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__CLASS_PATH = CONFIGURATION_ITEM__CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__INCLUDE = CONFIGURATION_ITEM__INCLUDE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__DESCRIPTION = CONFIGURATION_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM__NAME = CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM_FEATURE_COUNT = CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR = CONFIGURATION_ITEM___CREATE_CONTEXT__CONTEXT_SUBMONITOR;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP = CONFIGURATION_ITEM___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Config Work Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE = CONFIGURATION_ITEM___GET_CONFIG_WORK_SIZE;

	/**
	 * The number of operations of the '<em>Named Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CONFIGURATION_ITEM_OPERATION_COUNT = CONFIGURATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.config.Context
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 8;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getList()
	 * @generated
	 */
	int LIST = 9;

	/**
	 * The meta object id for the '<em>Sub Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.SubMonitor
	 * @see org.nasdanika.config.impl.ConfigPackageImpl#getSubMonitor()
	 * @generated
	 */
	int SUB_MONITOR = 10;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.nasdanika.config.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.config.Configuration#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Includes</em>'.
	 * @see org.nasdanika.config.Configuration#getIncludes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.config.Configuration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.nasdanika.config.Configuration#getConfiguration()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Configuration();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.config.Configuration#getDefaultIncludes <em>Default Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Includes</em>'.
	 * @see org.nasdanika.config.Configuration#getDefaultIncludes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_DefaultIncludes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.Configuration#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see org.nasdanika.config.Configuration#getBaseURL()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_BaseURL();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.config.Configuration#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class Path</em>'.
	 * @see org.nasdanika.config.Configuration#getClassPath()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ClassPath();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.config.Configuration#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include</em>'.
	 * @see org.nasdanika.config.Configuration#getInclude()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.Configuration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.config.Configuration#getDescription()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Description();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.config.Configuration#createContext(org.nasdanika.config.Context, org.eclipse.core.runtime.SubMonitor) <em>Create Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Context</em>' operation.
	 * @see org.nasdanika.config.Configuration#createContext(org.nasdanika.config.Context, org.eclipse.core.runtime.SubMonitor)
	 * @generated
	 */
	EOperation getConfiguration__CreateContext__Context_SubMonitor();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.config.Configuration#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see org.nasdanika.config.Configuration#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.config.Configuration#getConfigWorkSize() <em>Get Config Work Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Config Work Size</em>' operation.
	 * @see org.nasdanika.config.Configuration#getConfigWorkSize()
	 * @generated
	 */
	EOperation getConfiguration__GetConfigWorkSize();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.ConfigurationItem <em>Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Item</em>'.
	 * @see org.nasdanika.config.ConfigurationItem
	 * @generated
	 */
	EClass getConfigurationItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.nasdanika.config.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.Service#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see org.nasdanika.config.Service#getServiceType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.config.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.nasdanika.config.Provider
	 * @model instanceClass="org.nasdanika.config.Provider" typeParameters="T"
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.ValueConfigurationItem <em>Value Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Configuration Item</em>'.
	 * @see org.nasdanika.config.ValueConfigurationItem
	 * @generated
	 */
	EClass getValueConfigurationItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.ValueConfigurationItem#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.nasdanika.config.ValueConfigurationItem#getValueType()
	 * @see #getValueConfigurationItem()
	 * @generated
	 */
	EAttribute getValueConfigurationItem_ValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.config.ValueConfigurationItem#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.nasdanika.config.ValueConfigurationItem#getValues()
	 * @see #getValueConfigurationItem()
	 * @generated
	 */
	EAttribute getValueConfigurationItem_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.ValueConfigurationItem#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.nasdanika.config.ValueConfigurationItem#isDefault()
	 * @see #getValueConfigurationItem()
	 * @generated
	 */
	EAttribute getValueConfigurationItem_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.ValueConfigurationItem#isScripted <em>Scripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scripted</em>'.
	 * @see org.nasdanika.config.ValueConfigurationItem#isScripted()
	 * @see #getValueConfigurationItem()
	 * @generated
	 */
	EAttribute getValueConfigurationItem_Scripted();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.config.NamedConfigurationItem <em>Named Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Configuration Item</em>'.
	 * @see org.nasdanika.config.NamedConfigurationItem
	 * @generated
	 */
	EClass getNamedConfigurationItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.config.NamedConfigurationItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.config.NamedConfigurationItem#getName()
	 * @see #getNamedConfigurationItem()
	 * @generated
	 */
	EAttribute getNamedConfigurationItem_Name();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.config.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.nasdanika.config.Context
	 * @model instanceClass="org.nasdanika.config.Context"
	 * @generated
	 */
	EDataType getContext();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.SubMonitor <em>Sub Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sub Monitor</em>'.
	 * @see org.eclipse.core.runtime.SubMonitor
	 * @model instanceClass="org.eclipse.core.runtime.SubMonitor"
	 * @generated
	 */
	EDataType getSubMonitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.ConfigurationImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__INCLUDES = eINSTANCE.getConfiguration_Includes();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONFIGURATION = eINSTANCE.getConfiguration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Default Includes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DEFAULT_INCLUDES = eINSTANCE.getConfiguration_DefaultIncludes();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__BASE_URL = eINSTANCE.getConfiguration_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Class Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CLASS_PATH = eINSTANCE.getConfiguration_ClassPath();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INCLUDE = eINSTANCE.getConfiguration_Include();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DESCRIPTION = eINSTANCE.getConfiguration_Description();

		/**
		 * The meta object literal for the '<em><b>Create Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___CREATE_CONTEXT__CONTEXT_SUBMONITOR = eINSTANCE.getConfiguration__CreateContext__Context_SubMonitor();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Get Config Work Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___GET_CONFIG_WORK_SIZE = eINSTANCE.getConfiguration__GetConfigWorkSize();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.ConfigurationItemImpl <em>Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.ConfigurationItemImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getConfigurationItem()
		 * @generated
		 */
		EClass CONFIGURATION_ITEM = eINSTANCE.getConfigurationItem();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.ServiceImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_TYPE = eINSTANCE.getService_ServiceType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.PropertyImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.Provider <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.Provider
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.ValueConfigurationItemImpl <em>Value Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.ValueConfigurationItemImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getValueConfigurationItem()
		 * @generated
		 */
		EClass VALUE_CONFIGURATION_ITEM = eINSTANCE.getValueConfigurationItem();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONFIGURATION_ITEM__VALUE_TYPE = eINSTANCE.getValueConfigurationItem_ValueType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONFIGURATION_ITEM__VALUES = eINSTANCE.getValueConfigurationItem_Values();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONFIGURATION_ITEM__DEFAULT = eINSTANCE.getValueConfigurationItem_Default();

		/**
		 * The meta object literal for the '<em><b>Scripted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONFIGURATION_ITEM__SCRIPTED = eINSTANCE.getValueConfigurationItem_Scripted();

		/**
		 * The meta object literal for the '{@link org.nasdanika.config.impl.NamedConfigurationItemImpl <em>Named Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.impl.NamedConfigurationItemImpl
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getNamedConfigurationItem()
		 * @generated
		 */
		EClass NAMED_CONFIGURATION_ITEM = eINSTANCE.getNamedConfigurationItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CONFIGURATION_ITEM__NAME = eINSTANCE.getNamedConfigurationItem_Name();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.config.Context
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getContext()
		 * @generated
		 */
		EDataType CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Sub Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.SubMonitor
		 * @see org.nasdanika.config.impl.ConfigPackageImpl#getSubMonitor()
		 * @generated
		 */
		EDataType SUB_MONITOR = eINSTANCE.getSubMonitor();

	}

} //ConfigPackage
