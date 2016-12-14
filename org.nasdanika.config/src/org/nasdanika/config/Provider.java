package org.nasdanika.config;

import org.eclipse.core.runtime.SubMonitor;

/**
 * Provides configuration values.
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public interface Provider<T> {
	
	/**
	 * Obtain configuration value for a given context.
	 * @param context
	 * @return
	 * @throws Exception
	 */
	T get(Context context, SubMonitor monitor) throws Exception;

}
