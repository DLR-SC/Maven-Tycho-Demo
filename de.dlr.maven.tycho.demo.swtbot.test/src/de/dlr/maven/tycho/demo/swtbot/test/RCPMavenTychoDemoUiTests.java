/**
 * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.dlr.maven.tycho.demo.swtbot.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.junit.Test;

/**
 * 
 * A sample SWTBot Test Case
 *
 */
public class RCPMavenTychoDemoUiTests {
    
	private final SWTWorkbenchBot bot = new SWTWorkbenchBot();

    @Test
    public void test() {

    	// Close the Welcome Screen
    	bot.viewByTitle("Welcome").close();
    	
    	// Open the perspective Selection
    	bot.toolbarButtonWithTooltip("Open Perspective").click();
    	bot.shell("Open Perspective").activate();
    	
    	bot.table().select("DLR Maven Tycho Demo");
    	bot.button("Open").click();
    	
    	// Now find the view
    	bot.viewByTitle("Maven Tycho Demo View").setFocus();
    	
    	// Write a name, press the button, get the answer
    	bot.text().setText("DLR");
    	bot.button().click();
    	String answerString = bot.text(1).getText();
    	
    	// Check the answer is correct
    	assertEquals("Answer was correct", "Hello to my friend DLR", answerString);
    }
    
    @Test
    public void testFail() {
    	fail("fail");
    }
}