/**
 * generated by Xtext 2.19.0
 */
package org.eclipse.mydsl;

import org.eclipse.mydsl.MyDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
