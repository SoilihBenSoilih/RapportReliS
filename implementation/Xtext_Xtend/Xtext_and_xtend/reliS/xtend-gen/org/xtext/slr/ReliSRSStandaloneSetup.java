/**
 * generated by Xtext 2.14.0
 */
package org.xtext.slr;

import org.xtext.slr.ReliSRSStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ReliSRSStandaloneSetup extends ReliSRSStandaloneSetupGenerated {
  public static void doSetup() {
    new ReliSRSStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}