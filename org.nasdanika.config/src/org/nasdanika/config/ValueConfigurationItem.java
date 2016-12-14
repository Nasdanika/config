/**
 */
package org.nasdanika.config;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value configuration items can be configured with value in addition to configuration elements.
 * 
 * If ``scripted`` is true, the value is evaluated as a script.
 * 
 * Script is a Java method body returning Object and taking ``Context contect, String valueType`` paramters:
 * 
 * ```java
 * Object evaluate(Context context, String valueType) throws Exception {
 *     // --- Script here ---
 * }
 * ```
 * 
 * Otherwise, value and configuration items are injected into the configuration item via constructor. An appropriate constructor is selected based on 
 * whether the value is blank and configuration items are present:
 * 
 * * Empty values collection - single value object is instantiated with:
 *   * No configuration items - default constructor or a constructor which takes Context.
 *   * Configuration items - a constructor which takes Context.
 * * Non-empty values collection:
 *   * No configuration items - a constructor which takes String. If value is blank then the default constructor will be considered first, if exists.
 *   * Configuration items - a constructor which takes String and Context in any order. If value is blank then a constructor which takes Context will be considered first.
 * 
 * If configuration item's type is assignable from ``org.nasdanika.config.Provider``, then it gets instantiated using
 * either the default constructor, if it exists and value is blank, or a constructor which takes String. The provider's ``get(Context)`` method is used
 * to obtain actual configuration item.
 * 
 * If value is not blank, it is interpolated using properties already defined in the context and inherited from the parent context. 
 * Interpolation is the process of expanding tokens enclosed into double-curly brackets to the values of properties with corresponding names.
 * 
 * If a property with a given name is not defined, a token does not get expanded.
 * 
 * Example:
 * ```
 * {{base-package}}.impl
 * ```
 * 
 * If values size is greater than one, then value is an array with elments of ``valueType``. As such multi-value services are keyed by ``valueType[]`` as opposed to ``valueType`` for single-value or no value services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.ValueConfigurationItem#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.nasdanika.config.ValueConfigurationItem#getValues <em>Values</em>}</li>
 *   <li>{@link org.nasdanika.config.ValueConfigurationItem#isDefault <em>Default</em>}</li>
 *   <li>{@link org.nasdanika.config.ValueConfigurationItem#isScripted <em>Scripted</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.config.ConfigPackage#getValueConfigurationItem()
 * @model abstract="true"
 * @generated
 */
public interface ValueConfigurationItem extends ConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration item value type. Defaults to ``java.lang.String``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see org.nasdanika.config.ConfigPackage#getValueConfigurationItem_ValueType()
	 * @model
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.ValueConfigurationItem#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration item values. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see org.nasdanika.config.ConfigPackage#getValueConfigurationItem_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regular configuration shadow/override configuration items defined in parent context(s),
	 * default configuration items, on the contrary, get shadowed by parent's configuration items
	 * with the same keys.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.nasdanika.config.ConfigPackage#getValueConfigurationItem_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.ValueConfigurationItem#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Scripted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, value is treated as script and evaluated to compute actual value. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scripted</em>' attribute.
	 * @see #setScripted(boolean)
	 * @see org.nasdanika.config.ConfigPackage#getValueConfigurationItem_Scripted()
	 * @model
	 * @generated
	 */
	boolean isScripted();

	/**
	 * Sets the value of the '{@link org.nasdanika.config.ValueConfigurationItem#isScripted <em>Scripted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scripted</em>' attribute.
	 * @see #isScripted()
	 * @generated
	 */
	void setScripted(boolean value);

} // ValueConfigurationItem
