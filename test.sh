#!/usr/bin/env sh

##############################################################################
##
##  Full Cycle Test Script
##
##############################################################################

./gradlew -b ../febo/build.gradle publishToMavenLocal --P baseline=true && ./gradlew test application-service:generateFeboJar --i --stacktrace