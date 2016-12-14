package org.nasdanika.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Generation context.
 * @author Pavel Vlasov
 *
 */
public interface Context { // TODO - Autocloseable
	
	/**
	 * @param name
	 * @return Context property by name.
	 */
	Object get(String name);
	
	/**
	 * @param type
	 * @return Context service by type.
	 */
	<T> T get(Class<T> type); 
	
	/**
	 * @return {@link ClassLoader} to use for reflective operations. 
	 */
	ClassLoader getClassLoader();
	
	/**
	 * Creates a new sub-context for this context.
	 * @return
	 */
	default MutableContext createSubContext() {
		return this instanceof MutableContext ? ((MutableContext) this).createSubContext() : new SimpleMutableContext(this);
	}	
		
	Pattern TOKEN_PATTERN = Pattern.compile("\\{\\{(.+?)\\}\\}");	
	
	/**
	 * Expands tokens in the form of <code>{{token name[|default value]}}</code> to their values.
	 * If a token is not found expansion is not processed.
	 * @param input
	 * @param env
	 * @return
	 */
	default String interpolate(String input) {
		if (input == null) {
			return input;
		}
		Matcher matcher = TOKEN_PATTERN.matcher(input);
		StringBuilder output = new StringBuilder();
		int i = 0;
		while (matcher.find()) {
		    String token = matcher.group();
			String bareToken = token.substring(2, token.length()-2);
			int pipeIdx = bareToken.indexOf('|');
			String key = pipeIdx == -1 ? bareToken : bareToken.substring(0, pipeIdx);
			Object replacement = get(key);
			if (replacement == null && pipeIdx != -1) {
				replacement = bareToken.substring(pipeIdx+1);
			}
		    if (replacement != null) {
			    output.append(input.substring(i, matcher.start())).append(replacement);			    
			    i = matcher.end();
		    }
		}
		output.append(input.substring(i, input.length()));
		return output.toString();
	}
	
	
}
