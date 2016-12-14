/**
 */
package org.nasdanika.config.util;

import java.util.List;
import java.util.Map;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.nasdanika.config.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.config.ConfigPackage
 * @generated
 */
public class ConfigValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConfigValidator INSTANCE = new ConfigValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.config";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ConfigPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO - inject project class loader into context if not there yet.
		return validateGen(classifierID, value, diagnostics, context);
	}
	
	/**
	 * @generated
	 * @param classifierID
	 * @param value
	 * @param diagnostics
	 * @param context
	 * @return
	 */
	private boolean validateGen(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ConfigPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case ConfigPackage.CONFIGURATION_ITEM:
				return validateConfigurationItem((ConfigurationItem)value, diagnostics, context);
			case ConfigPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case ConfigPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ConfigPackage.PROVIDER:
				return validateProvider((Provider<?>)value, diagnostics, context);
			case ConfigPackage.VALUE_CONFIGURATION_ITEM:
				return validateValueConfigurationItem((ValueConfigurationItem)value, diagnostics, context);
			case ConfigPackage.NAMED_CONFIGURATION_ITEM:
				return validateNamedConfigurationItem((NamedConfigurationItem)value, diagnostics, context);
			case ConfigPackage.CONTEXT:
				return validateContext((Context)value, diagnostics, context);
			case ConfigPackage.EXCEPTION:
				return validateException((Exception)value, diagnostics, context);
			case ConfigPackage.LIST:
				return validateList((List<?>)value, diagnostics, context);
			case ConfigPackage.SUB_MONITOR:
				return validateSubMonitor((SubMonitor)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)configuration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(configuration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_validate(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationItem(ConfigurationItem configurationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)configurationItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)configurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(configurationItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)service, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(service, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)property, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(property, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider<?> provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueConfigurationItem(ValueConfigurationItem valueConfigurationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)valueConfigurationItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)valueConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(valueConfigurationItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedConfigurationItem(NamedConfigurationItem namedConfigurationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)namedConfigurationItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)namedConfigurationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_validate(namedConfigurationItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContext(Context context, DiagnosticChain diagnostics, Map<Object, Object> theContext) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateException(Exception exception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List<?> list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubMonitor(SubMonitor subMonitor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CodegenValidator
