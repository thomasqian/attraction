#!/bin/bash
javac Attraction/*.java
jar cvfm Attraction.jar Attraction/manifest.txt Attraction/*.class