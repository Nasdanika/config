package org.nasdanika.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;
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
	 * @param strInput
	 * @param env
	 * @return
	 */
	default String interpolate(Object input) throws IOException {
		if (input == null) {
			return null;
		}
		String strInput = stringify(input);
		Matcher matcher = TOKEN_PATTERN.matcher(strInput);
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
			    output.append(strInput.substring(i, matcher.start())).append(replacement);			    
			    i = matcher.end();
		    }
		}
		output.append(strInput.substring(i, strInput.length()));
		return output.toString();
	}
	
	/**
	 * Converts content to string. Handles for input streams, readers, producers and URL's.
	 * @param content
	 * @return
	 * @throws IOException 
	 */
	default String stringify(Object content) throws IOException {
		if (content == null) {
			return "";
		}
		
		if (content instanceof String) {
			return (String) content;
		}
					
		if (content instanceof InputStream) {
			try (Reader reader = new InputStreamReader((InputStream) content)) {
				return stringify(reader);
			}
		}
		if (content instanceof Reader) {
			try (Reader reader = (Reader) content) {
				StringWriter sw = new StringWriter();
				for (int ch = reader.read(); ch!=-1; ch = reader.read()) {
					sw.write(ch);
				}
				sw.close();
				return sw.toString();
			}
		}
		
		if (content instanceof URL) {
			return stringify(((URL) content).openStream());
		}

		return content.toString();
	}
	
}
