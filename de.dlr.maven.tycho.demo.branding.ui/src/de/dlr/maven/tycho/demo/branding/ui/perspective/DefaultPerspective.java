/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.maven.tycho.demo.branding.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * This is the Perspective Factory for the initial Phase A View.
 *
 */
public class DefaultPerspective implements IPerspectiveFactory {

	public static final String ID_LEFT_FOLDER = "de.dlr.maven.tycho.demo.perspective.LEFT";
	public static final String ID_BOTTOM_LEFT_FOLDER = "de.dlr.maven.tycho.demo.perspective.BOTTOMLEFT";
	public static final String ID_BOTTOM_RIGHT_FOLDER = "de.dlr.maven.tycho.demo.perspective.BOTTOMRIGHT";
	public static final String ID_LEFT_MID_FOLDER = "de.dlr.maven.tycho.demo.perspective.LEFT_MID";
	
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();

		final float QUARTER = 0.25f;
		final float TWOTHIRDS = 0.66f;
		
		// Create a folder to bottom left and Add the problem view to the left bottom side		
		IFolderLayout bottomrightFolder = layout.createFolder(ID_BOTTOM_RIGHT_FOLDER, IPageLayout.BOTTOM, TWOTHIRDS, editorArea);
		bottomrightFolder.addView("org.eclipse.ui.views.PropertySheet");
		bottomrightFolder.addView("org.eclipse.ui.views.ProblemView");
		bottomrightFolder.addView("de.dlr.maven.tycho.demo.hello.ui.view");
		
		// Create a folder to the bottom right and add the outline view to it
		IFolderLayout bottomleftFolder = layout.createFolder(ID_BOTTOM_LEFT_FOLDER, IPageLayout.LEFT, QUARTER, ID_BOTTOM_RIGHT_FOLDER);
		bottomleftFolder.addView("org.eclipse.ui.views.ContentOutline");
		
		
		// Create a folder to left and Add the navigator to the left side
		IFolderLayout leftFolder = layout.createFolder(ID_LEFT_FOLDER, IPageLayout.LEFT, QUARTER, editorArea);
		leftFolder.addView("org.eclipse.ui.navigator.ProjectExplorer");
	}
}
