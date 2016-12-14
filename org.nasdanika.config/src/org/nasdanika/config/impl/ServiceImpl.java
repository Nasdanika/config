/**
 */
package org.nasdanika.config.impl;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.config.ConfigPackage;
import org.nasdanika.config.Context;
import org.nasdanika.config.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.config.impl.ServiceImpl#getServiceType <em>Service Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ValueConfigurationItemImpl implements Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceType() {
		return (String)eGet(ConfigPackage.Literals.SERVICE__SERVICE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(String newServiceType) {
		eSet(ConfigPackage.Literals.SERVICE__SERVICE_TYPE, newServiceType);
	}
	
	@Override
	public Object get(Context context, SubMonitor monitor) throws Exception {
		monitor.subTask("Loading service "+(getServiceType() == null || getServiceType().trim().length() == 0 ? getValueType() : getServiceType()));		
		return super.get(context, monitor);
	}

} //ServiceImpl
