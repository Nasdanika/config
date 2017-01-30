package org.nasdanika.config;

/**
 * Properties of this type can be used for dynamic evaluation of tokens during interpolation.
 * For example, if {@link Context} has a {@link TokenSource} property under the key <code>java</code>, then <code>{{java:expr}}</code> will be evaluated by invoking getToken() with
 * the context as the first argument and <code>expr</code> as the second. 
 * @author Pavel
 *
 */
public interface TokenSource {
	
	/**
	 * 
	 * @param context Context.
	 * @param name Token name
	 * @return Token value
	 */
	Object getToken(Context context, String name);

}
