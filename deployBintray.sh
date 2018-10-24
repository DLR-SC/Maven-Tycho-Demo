#!/bin/bash
#/*
# * Copyright (c) 2008-2018 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
# * All rights reserved. This program and the accompanying materials
# * are made available under the terms of the Eclipse Public License v1.0
# * which accompanies this distribution, and is available at
# * http://www.eclipse.org/legal/epl-v10.html
# */
echo "This is a deploy script for bintray upload of eclipse p2 repositories"
echo "---------------------------------------------------------------------"
echo ""
echo "This script is intended to deploy to a generic Bintray repository."
echo ""
echo "Usage : deployBintray.sh user token owner repo package version [p2path] [override]"
echo ""
echo "   user     - Your bintray user name."
echo "   token    - Your bintray api token."
echo "   owner    - The repository owner which is usually you or the organization you deploy for."
echo "   repo     - The name of the repository to deploy to. Has to be created before upload using the Bintray web interface."
echo "   package  - The name of the package to deploy to. Has to be created before upload using the Bintray web interface."
echo "   version  - The version to deploy to. Is automatically created."
echo "   p2path   - The optional path to the locally stored p2 repository." 
echo "   override - The optional flag to override a published repository for the given package name and version." 
echo ""
echo "example :  deployBintray.sh user abcdef1234567890abcdef1234567890 company test development latest ./development/p2 override"
echo ""
echo "OK, it is time to get started"
echo "-----------------------------"
echo ""
echo "Checking amount of parameters: $#"

# First check the amount of parameters
if [ $# -lt 6 ] || [ $# -gt 8 ]; then
  echo "Error: Incorrect amount of arguments."
  exit 1
fi

# Now grab the parameters which are mandatory for the execution
BINTRAY_API=https://api.bintray.com
BINTRAY_USER=$1
BINTRAY_API_KEY=$2
BINTRAY_OWNER=$3
BINTRAY_REPO=$4
DEPLOY_PACKAGE_NAME=$5
DEPLOY_PACKAGE_VERSION=$6

# In case of 7 parameters the 7th can be the path or the overwrite flag
if [ $# -ge 7 ]; then
  if [ $7 == "override" ]; then
    BINTRAY_OVERRIDE=1
  else
    BINTRAY_OVERRIDE=0
    PATH_P2_REPOSITORY=$7
  fi  
fi

# in case of 8 parameters the 8th has to be overwrite
if [ $# -eq 8 ]; then
  if [ $8 == "override" ]; then
    BINTRAY_OVERRIDE=1
  else
    echo "Error: Incorrect 8th parameter."
    exit 1
  fi  
fi

# Now create derived variables
TARGET_PATH="$DEPLOY_PACKAGE_NAME/$DEPLOY_PACKAGE_VERSION"

echo "all parameters parsed and set up for deployment"
echo ""

# -------------------------------------------
# Function for Bintray API Call to upload a
# file
# parameters: the file to be uploaded
# -------------------------------------------
function bintrayApiPutFile {
 	CURL_RESULT=$(curl -XPUT -T $1 -u${BINTRAY_USER}:${BINTRAY_API_KEY} "${BINTRAY_API}/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${TARGET_PATH}/$1;bt_package=${DEPLOY_PACKAGE_NAME};bt_version=${DEPLOY_PACKAGE_VERSION};publish=0;override=${BINTRAY_OVERRIDE}")
  if [[ $CURL_RESULT != *"success"* ]]; then
    echo "ERROR: Failed upload due to: $CURL_RESULT"
    exit 1
  fi
}

# -------------------------------------------
# Function for Bintray API to publish an
# upload
# parameters: none
# -------------------------------------------
function bintrayApiPushPublish {
	curl -X POST -u ${BINTRAY_USER}:${BINTRAY_API_KEY} ${BINTRAY_API}/content/${BINTRAY_OWNER}/${BINTRAY_REPO}/${DEPLOY_PACKAGE_NAME}/${DEPLOY_PACKAGE_VERSION}/publish -d "{ \"discard\": \"false\" }"
}

# -------------------------------------------------
# Function for deploying a directory
# parameters: the folder with wildcard for files
# Usually called with parameters like "./plugins/*"
# -------------------------------------------------
function bintrayDeployFiles {
  echo "Starting to upload all files with $1 ..."
  for file in $1;
  do
  if [ ! -d $file ]; then
    echo "Uploading file $file ..."
    bintrayApiPutFile $file
    echo ""
  fi
  done
}

# -------------------------------------------
# Main function to deploy a p2 update site
# parameters: all from commandline
# usually call this method by "$@"
# -------------------------------------------
function deployP2UpdateSite {
  echo "OK, starting the deployment"
  echo "---------------------------"
  echo ""
  echo "Summary of parameters follows..."
  echo "User:         ${BINTRAY_USER}"
  echo "Token:        xxxx"
  echo "Owner:        ${BINTRAY_OWNER}"
  echo "Repo:         ${BINTRAY_REPO}"
  echo "Package:      ${DEPLOY_PACKAGE_NAME}"
  echo "Version:      ${DEPLOY_PACKAGE_VERSION}"
  echo "Path P2:      ${PATH_P2_REPOSITORY}"
  echo "Path Bintray: ${TARGET_PATH}"
  echo "Override:     ${BINTRAY_OVERRIDE}"
  echo ""
  echo "Switching directories into p2 repository"
  
  if [ ! -z "$PATH_P2_REPOSITORY" ]; then
     cd $PATH_P2_REPOSITORY
     if [ $? -ne 0 ]; then
       echo $PATH_P2_REPOSITORY " does not exist"
       exit 1
     fi
  fi

  # Define the folders to obey for the upload to bintray
  P2_METADATA_FILES=./*
  P2_PLUGIN_DIRECTROY=./plugins/*
  P2_BINARY_DIRECTORY=./binary/*
  P2_FEATURES_DIRECTORY=./features/*
  
  bintrayDeployFiles "$P2_PLUGIN_DIRECTROY"
  bintrayDeployFiles "$P2_BINARY_DIRECTORY"
  bintrayDeployFiles "$P2_FEATURES_DIRECTORY"
  bintrayDeployFiles "$P2_METADATA_FILES"
  
  # Finally Publish the new Version

  echo "Finally publishing the new version of the repository ..."
	bintrayApiPushPublish
  echo ""
  echo "All done ... Thank You ..." 
}

deployP2UpdateSite "$@"
