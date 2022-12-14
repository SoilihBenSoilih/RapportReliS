/*
 * generated by Xtext 2.14.0
 */
package org.xtext.slr.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.slr.ReliSRSRuntimeModule
import org.xtext.slr.ReliSRSStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ReliSRSIdeSetup extends ReliSRSStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ReliSRSRuntimeModule, new ReliSRSIdeModule))
	}
	
}
