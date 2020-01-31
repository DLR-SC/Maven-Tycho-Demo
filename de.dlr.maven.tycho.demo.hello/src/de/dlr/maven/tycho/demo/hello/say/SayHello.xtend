/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
 package de.dlr.maven.tycho.demo.hello.say

/**
 * This is a little example class saying hello
 */
class SayHello {

	/**
	 * This method sais hello to one of your friends
	 * @param friendsName The friends name to say hello to
	 * @return the full string saying hello to your friend
	 */
	def toMyFriend(String friendsName) {
		"Hello to my friend " + friendsName
	}
}
