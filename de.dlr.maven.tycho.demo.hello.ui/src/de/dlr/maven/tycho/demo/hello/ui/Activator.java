/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.hello.ui;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activator class of this Plugin
 */
public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "de.dlr.maven.tycho.demo.hello.ui";

	/**
	 * Constructor of the Activator
	 */
	public Activator() {
		super();
	}

	private static Plugin plugin;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		plugin = this;
	}
	
	/**
	 * get Default plugin for access to Logger etc
	 * @return the default plugin of thei activator
	 */
	public static Plugin getDefault() {
		return plugin;
	}
}
