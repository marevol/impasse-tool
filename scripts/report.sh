#!/bin/sh

cd `dirname $0`
cd ..
BASE_DIR=`pwd`
LIB_DIR=$BASE_DIR/target/dependency
JAR_FILE=`ls $BASE_DIR/target/impasse-tool-*.jar`
CP_PATH="templates:$JAR_FILE"

for file in `ls $LIB_DIR/*.jar` ; do
    CP_PATH="$CP_PATH:$file"
done

java -cp $CP_PATH net.marevol.redmine.impasse.cmd.Report $@

