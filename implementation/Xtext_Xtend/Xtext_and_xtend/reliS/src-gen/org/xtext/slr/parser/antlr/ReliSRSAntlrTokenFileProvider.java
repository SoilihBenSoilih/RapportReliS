/*
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ReliSRSAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/slr/parser/antlr/internal/InternalReliSRS.tokens");
	}
}
