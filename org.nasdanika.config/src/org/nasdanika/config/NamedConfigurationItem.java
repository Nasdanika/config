/**
 */
package org.nasdanika.config;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Named configuration is keyed by a String.
 * 
 * Named configuration item is facaded by Context at runtime. Properties of the named configuration item can be accessed using / separator, e.g. ``feature/includedFeatures``.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.NamedConfigurationItem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.config.ConfigPackage#getNamedConfigurationItem()
 * @model
 * @generated
 */
public interface NamedConfigurationItem extends ConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.config.ConfigPackage#getNamedConfigurationItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.NamedConfigurationItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedConfigurationItem
