# Checklist for Application Class 1 
> The checklist is based on version 1.1. It refers to the DLR Software Engineering Guidelines [Reference Manual](https://doi.org/10.5281/zenodo.1344612) in version 1.0.0.

## Summary of Results
The software DLR **Maven Tycho Demo** implements **[All]** recommendations of application class **[1]**. 

The focus of future improvements is on:

## Table of Contents
[[Qualification](#qualifizierung)] [[Requirements Management](#anforderungsmanagement)] [[Software Architecture](#software-architektur)] [[Change Management](#aenderungsmanagement)] [[Design and Implementation](#design-implementierung)] [[Software Test](#software-test)] [[Release Management](#release-management)] [[Automation and Dependency Management](#automatisierung-abhaengigkeiten)] 

## Qualification <a name="qualifizierung"></a>
**EQA.1** - **[OK]** The software responsible recognizes the different application classes and knows which is to be used for his/her software. *(from application class 1)*

**EQA.2** - **[OK]** The software responsible knows how to request specific support at the beginning and during development as well as to exchange ideas with other colleagues on the subject of software development. *(from application class 1)*

**EQA.3** - **[OK]** The persons involved in the development determine the skills needed with regard to their role and the intended application class. They communicate these needs to the supervisor. *(from application class 1)*

**EQA.4** - **[OK]** The persons involved in the development are given the tools needed for their tasks and are trained in their use. *(from application class 1)*

## Requirements Management <a name="anforderungsmanagement"></a>
**EAM.1** - **[OK]** The problem definition is coordinated with all parties involved and documented. It describes the objectives, the purpose of the software, the essential requirements and the desired application class in a concise, understandable way. *(from application class 1)*

**EAM.3** - **[OK]** The constraints are documented. *(from application class 1)*

## Software Architecture <a name="software-architektur"></a>
**ESA.2** - **[OK]** Essential architectural concepts and corresponding decisions are at least documented in a lean way. *(from application class 1)*

## Change Management <a name="aenderungsmanagement"></a>
**EÄM.2** - **[OK]** The most important information describing how to contribute to development are stored in a central location. *(from application class 1)*

**EÄM.5** - **[OK]** Known bugs, important unresolved tasks and ideas are at least noted in bullet point form and stored centrally. *(from application class 1)*

**EÄM.7** - **[OK]** A repository is set up in a version control system. The repository is adequately structured and ideally contains all artifacts for building a usable software version and for testing it. *(from application class 1)*

**EÄM.8** - **[OK]** Every change of the repository ideally serves a specific purpose, contains an understandable description and leaves the software in a consistent, working state. *(from application class 1)*

## Design and Implementation <a name="design-implementierung"></a>
**EDI.1** - **[OK]** The usual patterns and solution approaches of the selected programming language are used and a set of rules regarding the programming style is consistently applied. The set of rules refers at least to the formatting and commenting. *(from application class 1)*

**EDI.2** - **[OK]** The software is structured modularly as far as possible. The modules are coupled loosely. I.e., a single module depends as little as possible on other modules. *(from application class 1)*

**EDI.9** - **[OK]** The source code and the comments contain as little duplicated information as possible. ("Don`t repeat yourself.") *(from application class 1)*

**EDI.10** - **[OK]** Prefer simple, understandable solutions. ("Keep it simple and stupid."). *(from application class 1)*

## Software Test <a name="software-test"></a>
**EST.4** - **[OK]** The basic functions and features of the software are tested in a near-operational environment. *(from application class 1)*

**EST.10** - **[OK]** The repository ideally contains all artifacts required to test the software. *(from application class 1)*

## Release Management <a name="release-management"></a>
**ERM.1** - **[OK]** Every release has a unique release number. The release number can be used to determine the underlying software version in the repository. *(from application class 1)*

**ERM.2** - **[OK]** The release package contains or references the user documentation. At least, it consists of installation, usage and contact information as well as release notes. In the case of the distribution of the release package to third parties outside DLR, the licensing conditions must be enclosed. *(from application class 1)*

**ERM.6** - **[OK]** All foreseen test activities are executed during release performance. *(from application class 1)*

**ERM.9** - **[OK]** Prior to distribution of the release package to third parties outside DLR, it must be ensured that a license is defined, that the licensing terms of used third-party software are met, and that all necessary license information is included in the release package. *(from application class 1)*

**ERM.10** - **[OK]** Prior to distribution of the release package to third parties outside DLR, it has to be ensured that the export control regulations are met. *(from application class 1)*

## Automation and Dependency Management <a name="automatisierung-abhaengigkeiten"></a>
**EAA.1** - **[OK]** The simple build process is basically automated and necessary manual steps are described. In addition, there is sufficient information available about the operational and development environment. *(from application class 1)*

**EAA.2** - **[OK]** The dependencies to build the software are at least described by name, version number, purpose, licensing terms and reference source. *(from application class 1)*

**EAA.10** - **[OK]** The repository ideally contains all artifacts to perform the build process. *(from application class 1)*


## Usage Hints For this Checklist
This checklist provides recommendations for software development. It is primarily intended for software developers for the self-assessment of developed software and as a source of ideas for further development. The checklist does not provide any new, revolutionary approaches to software development. However, it helps to not forget necessary, essential steps of software development. In addition, the recommendations can serve as an argumentation aid. 

The recommendations are created with a focus on know-how maintenance and good software engineering practice. They help to maintain the sustainability of the developed software. The recommendations encourage the use of tools, the creation of documentation, the establishment of processes and adherence to principles. When assessing a recommendation, it is recommended to consider to what extent the aspect mentioned is implemented and whether there is a need for improvement. This could be implemented as follows: 

* Is there currently no need for improvement and is the recommendation addressed appropriately? Status: **ok** 
* Is there any potential for improvement that should be implemented in the near future? Status: **todo**, record the need for improvement 
* Is the recommendation not yet relevant but could be helpful in a later development phase? Status: **future** 
* Is the recommendation not meaningfully implementable within the development context? Status: **n.a.** (not applicable) explain the reason 

In case of questions, you can contact the Software Engineering Contact of your institute or facility.

> Please note the status between "[]" and list remarks below a recommendation.

