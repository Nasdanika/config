/**
 */
package org.nasdanika.config.impl;

import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.config.ConfigPackage;
import org.nasdanika.config.Context;
import org.nasdanika.config.NamedConfigurationItem;
import org.nasdanika.config.Property;
import org.nasdanika.config.util.ConfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.impl.PropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends ValueConfigurationItemImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ConfigPackage.Literals.NAMED_CONFIGURATION_ITEM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ConfigPackage.Literals.NAMED_CONFIGURATION_ITEM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedConfigurationItem.class) {
			switch (derivedFeatureID) {
				case ConfigPackage.PROPERTY__NAME: return ConfigPackage.NAMED_CONFIGURATION_ITEM__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedConfigurationItem.class) {
			switch (baseFeatureID) {
				case ConfigPackage.NAMED_CONFIGURATION_ITEM__NAME: return ConfigPackage.PROPERTY__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {
			if (getName() == null || getName().trim().length() == 0) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConfigValidator.DIAGNOSTIC_SOURCE,
						 ConfigValidator.CONFIGURATION__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Blank name",
						 new Object [] { this, ConfigPackage.Literals.NAMED_CONFIGURATION_ITEM__NAME }));
				
				result = false;
			}
		}
		return result;
	}	
	
	@Override
	public Object get(Context context, SubMonitor monitor) throws Exception {
		monitor.subTask("Loading property "+getName());		
		return super.get(context, monitor);
	}

} //PropertyImpl
