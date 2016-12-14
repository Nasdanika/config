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
import org.nasdanika.config.util.ConfigValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.impl.NamedConfigurationItemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedConfigurationItemImpl extends ConfigurationItemImpl implements NamedConfigurationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.NAMED_CONFIGURATION_ITEM;
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
	
	@Override
	public Object get(Context context, SubMonitor monitor) throws Exception {
		return createContext(context, monitor);
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
	
} //NamedConfigurationItemImpl
