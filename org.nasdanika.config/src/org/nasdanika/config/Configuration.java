/**
 */
package org.nasdanika.config;

import java.util.Map;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of configuration items - properties and services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.Configuration#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getDefaultIncludes <em>Default Includes</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.config.Configuration#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.config.ConfigPackage#getConfiguration()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Configuration extends CDOObject {
	
	/**
	 * Property which contains base URL.
	 */
	String BASE_URL_PROPERTY = "base-url";
	
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL's of configuration files to load into the this configurable's context.
	 * URL's are resolved relative to the ``baseURL``, which in turn is resolved relative to the model resource. 
	 * 
	 * The following custom schemes supported:
	 * 
	 * * ``bundle`` - ``bundle:<bundle symbolic name>/<resource path in the bundle>``
	 * * ``java`` - ``java:<classloader path>``
	 * 
	 * Configuration files can be in the following formats:
	 * 
	 * * XMI model - ``.xml`` or ``.nsdgen`` extension.
	 * * Properties file - ``.properties`` extension.
	 * * JSON file following the structure of the configuration model - ``.json`` extension.
	 * * YAML file following the structure of the configuration model - ``.yml`` extension.
	 * 
	 * If XML/JSON/YAML contains configuration definition, then its ``createContext()`` method is invoked in sequence
	 * to create a chain of contexts. If property or service is contained in the definition, it gets mounted to a context created by this configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes</em>' attribute list.
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_Includes()
	 * @model
	 * @generated
	 */
	EList<String> getIncludes();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.config.ConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration items - properties and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItem> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Default Includes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same as ``includes``, but default includes are used only if the parent context doesn't contain configuration items with requested keys (names or types).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Includes</em>' attribute list.
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_DefaultIncludes()
	 * @model
	 * @generated
	 */
	EList<String> getDefaultIncludes();

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL to resolve includes, default includes, and classpath entries. 
	 * The URL is resolved relative to the model location and defaults to the model location URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.Configuration#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class path for loading classes of configuration elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute list.
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_ClassPath()
	 * @model
	 * @generated
	 */
	EList<String> getClassPath();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.config.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configurations defined elsewhere to be included into this configuration. 
	 * Configurations get chained and configuration items (properties and services) get
	 * mounted to the context created by this configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_Include()
	 * @model
	 * @generated
	 */
	EList<Configuration> getInclude();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.config.ConfigPackage#getConfiguration_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.Configuration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates ``org.nasdanika.config.Context`` which provides access to properties and services.
	 * @param parent Parent context.
	 * <!-- end-model-doc -->
	 * @model dataType="org.nasdanika.config.Context" exceptions="org.nasdanika.config.Exception" parentDataType="org.nasdanika.config.Context" monitorDataType="org.nasdanika.config.SubMonitor"
	 * @generated
	 */
	Context createContext(Context parent, SubMonitor monitor) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element.
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getConfigWorkSize();

} // Configuration
