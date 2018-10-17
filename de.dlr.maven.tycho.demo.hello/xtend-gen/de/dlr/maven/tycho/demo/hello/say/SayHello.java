/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.hello.say;

/**
 * This is a little example class saying hello
 */
@SuppressWarnings("all")
public class SayHello {
  /**
   * This method sais hello to one of your friends
   * @param friendsName The friends name to say hello to
   * @return the full string saying hello to your friend
   */
  public String toMyFriend(final String friendsName) {
    return ("Hello to my friend " + friendsName);
  }
}
