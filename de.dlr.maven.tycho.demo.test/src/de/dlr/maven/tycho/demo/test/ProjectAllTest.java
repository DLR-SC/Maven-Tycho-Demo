/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
				de.dlr.maven.tycho.demo.hello.say.test.AllTests.class,
				})

/**
 * Test Class
 */
public class ProjectAllTest {   
}