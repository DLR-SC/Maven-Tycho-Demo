/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * the activator is the entry point for this plugin
 */
public class Activator implements BundleActivator {

	private static BundleContext context;

	/**
	 * getter method to retrieve the context
	 * @return {@link BundleContext} the context of the bundle in the OSGi Framework bundle context  
	 */
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
