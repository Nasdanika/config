package org.nasdanika.config;

public interface MutableContext extends Context {
		
	MutableContext set(String name, Object value);
	
	<T> MutableContext set(Class<T> type, T service);
	
	MutableContext setClassLoader(ClassLoader classLoader);
	
}
