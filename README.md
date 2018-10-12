# Maven Tycho Demo

A Maven Tycho Demo project for Eclipse RCP applications such as Virtual Satellite.

## Purpose

1. This project is a test setup to make Virtual Satellite open source. it helps to transform the software engineering processes from the internal towards the GitHub infrastructure. 
2. Maven Tycho can be very complicated. This project helps developers that are new to Maven Tycho. This project provides core functionality to automate an Eclipse RCP build process and helps setting up such process.

## Requirements 

This Maven Tycho Demo is based on Java / Eclipse. The following infrastructure is required:
 - Java Development Kit (JDK) 8
 - Eclipse Oxygen
   - Including Checkstyle
   - Including M2E
 - Maven 3
 - Windows 7 or Linux Computer

## Quickstart

1. Open your Eclipse and switch to the Git Perspective.
2. Clone this repository.
3. Import all projects and working-sets via the ProjectSet file in _de.dlr.maven.tycho.demo/projectSet_
4. Resolve and set the targe tplatform in _de.dlr.maven.tycho.demo.target/mavenTychoDemo.target
5. Execute the launchers for running the RCP application from within _de.dlr.maven.tycho.demo/launchers_
6. Execute the Tycho Maven build from _de.dlr.maven.tycho.demo/launchers_
7. Inspect the build artifacts for the p2 repository in _de.dlr.maven.tycho.p2updatesite/target_
7. Inspect the build RCP application in _de.dlr.maven.tycho.product/target_

## Provided Features

This example intends to represent a realistic scenario for building an Eclipse based RCP application such as Virtual Satellite. Accordingly it provides the following features:
 - Maven Tycho Build Process for Eclipse RCP Applications
 - Examples for Build with maven and eclipse
 - Examples for Development, Integration and Release builds
 - Examples for Features, Plugins, Products, Update Sites
 - Examples for License Feature
 - Examples for Branding Feature
 - Examples for Documents Feature with Release Notes and API Doc
 - Examples for External Library Dependencies
 - Examples for Test Fragments	
 - Integration of JUnit tests
 - Integration of Checkstyle tests
 - Standalone Maven Tycho build process
 - Eclipse IDE Integrated Maven Tycho build process

## Software Engineering Requirements

This project follows DLR Software Engineering Requirements for application class 1 as documented in the [Checklist](se_checklist_app_class_1.md).
 
## Contribution

This project is currently not open for contribution. In case you need or want to contribute, please contact us. 

## License

Copyright 2018 German Aerospace Center (DLR)

The German Aerospace Center (DLR) makes available all content in this plug-in ("Content"). Unless otherwise indicated below, the Content is provided to you under the terms and conditions of the Eclipse Public License Version 1.0 ("EPL"). A copy of the EPL is available at http://www.eclipse.org/legal/epl-v10.html or provided with this Content. For purposes of the EPL, "Program" will mean the Content.

If you did not receive this Content directly from German Aerospace Center (DLR), the Content is being redistributed by another party ("Redistributor") and different terms and conditions may apply to your use of any object code in the Content. Check the Redistributor's license that was provided with the Content. If no such license exists, contact the Redistributor. Unless otherwise indicated below, the terms and conditions of the EPL still apply to this content.

## Third Party Licenses

Their party licenses are named in the plugins where used in the respective _aboutfiles_ folders. At runtime third party licenses can be viewed in the usual Eclipse About dialog.
