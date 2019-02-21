/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.hello;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The plugin root class which is the entry point for the OSGi bundle activation
 * 
 */
public class Activator extends Plugin {

	public static final String PLUGIN_ID = "de.dlr.maven.tycho.demo.hello";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
//	// uncomment the following method to create compile warnings
//	/**
//	 * A method that is never used
//	 */
//	private void unusedMethod() {
//	}
	
//	// uncomment the following method to create some spotbugs warnings
//	/**
//	 * This method creates a spotbug issue. uncomment to give it a try
//	 * @return true in case the random number is one, doesn't it ??!
//	 */
//	public boolean spotBugsExample() {
//		int i = (int) Math.random();
//		return (i == 1); 
//	}
	
	
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}

//	String name;
	
//	/**
//	 * test the method
//	 * @param o object
//	 * @return boolean
//	 */
//	public boolean equals(Object o) {
//	    if (o instanceof Activator) {
//			return name.equals(((Activator) o).name);
//		} else if (o instanceof String) {
//			return name.equals(o);
//		} else {
//			return false;
//		}
//	}
	
//	public void methodWithoutComment() {
//		// This method has no comment header which should make the travis build complain.
//	    // Comment out this method to test for a checkstyle warning
//	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
