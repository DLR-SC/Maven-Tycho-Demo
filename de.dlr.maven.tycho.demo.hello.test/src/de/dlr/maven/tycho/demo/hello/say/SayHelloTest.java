/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.maven.tycho.demo.hello.say;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test Cases for the Say Hello Example
 */
public class SayHelloTest {

	@Test
	public void testToMyFriend() {
		assertEquals("Greetings to my correct friend", "Hello to my friend Jan", new SayHello().toMyFriend("Jan"));
		assertEquals("Greetings to my correct friend", "Hello to my friend Marie", new SayHello().toMyFriend("Marie"));
	}

//  Uncomment the following lines to make travis break on unit tests.	
//	@Test
//	public void testFailSomething() {
//		fail("fail");
//	}
}
