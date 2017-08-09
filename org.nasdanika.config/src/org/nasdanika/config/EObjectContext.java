package org.nasdanika.config;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Uses reflection to get property values. Feature names can be separated by / (feature paths), elements of many-features can be addressed with index in the path. E.g. <code>pages/0/name</code>.  
 * {@link EObject}'s can implement this interface.
 * @author Pavel
 *
 */
public interface EObjectContext extends Context {
	
	@Override
	default <T> T get(Class<T> type) {
		// Does not support services.
		return null;
	}
	
	@Override
	default Object get(String name) {
		if (name == null || name.trim().length() == 0 || !(this instanceof EObject)) {
			return null;
		}
		
		EObject eObj = (EObject) this;
		
		String[] featurePath = name.split("/");
		EStructuralFeature feature = eObj.eClass().getEStructuralFeature(name);
		if (feature == null) {
			return null;
		}
		
		Object fv = eObj.eGet(feature);
		if (featurePath.length == 1) {
			return fv;
		}
		int idx = 1;
		if (feature.isMany()) {
			@SuppressWarnings("unchecked")
			List<Object> fvl = (List<Object>) fv;
			fv = fvl.get(Integer.parseInt(featurePath[1]));
			++idx;
			if (featurePath.length == idx) {
				return fv;
			}
		}
		if (fv instanceof Context) {
			StringBuilder subNameBuilder = new StringBuilder(featurePath[idx]);
			for (int i = idx+1; i<featurePath.length; ++i) {
				subNameBuilder.append("/").append(featurePath[i]);
			}
			return ((Context) fv).get(subNameBuilder.toString());
		}
		
		return null;
	}
	
	@Override
	default ClassLoader getClassLoader() {
		return this.getClassLoader();
	}

}
