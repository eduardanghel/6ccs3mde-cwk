/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PlanningAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/eanghel/planning/parser/antlr/internal/InternalPlanning.tokens");
	}
}
