/*
* generated by Xtext
*/
package at.ac.tuwien.big.forms.entity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EntityStandaloneSetup extends EntityStandaloneSetupGenerated{

	public static void doSetup() {
		new EntityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

