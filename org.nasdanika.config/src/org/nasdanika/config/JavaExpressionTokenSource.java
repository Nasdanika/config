package org.nasdanika.config;

import org.codehaus.janino.ExpressionEvaluator;

/**
 * Evaluates Java expression using Janino's {@link ExpressionEvaluator} with <code>context</code> argument and context's classloader.
 * @author Pavel
 *
 */
public class JavaExpressionTokenSource implements TokenSource {

	@Override
	public Object getToken(Context context, String name) {
		try {
			ExpressionEvaluator evaluator = new ExpressionEvaluator();
			evaluator.setParentClassLoader(context.getClassLoader());
			evaluator.setParameters(new String[] { "context" }, new Class<?>[] { Context.class });
			evaluator.setExpressionType(Object.class);
			evaluator.setThrownExceptions(new Class[] { Exception.class });
			evaluator.cook(name);
			return evaluator.evaluate(new Object[] { context });
		} catch (Exception e) {
			throw new IllegalArgumentException("Could not evaluate '"+name, e);
		}
	}

}
