#!/bin/bash
jarName=zuul-server-1.0.0.jar
#1. 重新打包编译
cd ../
mvn package -Dmaven.test.skip=true
cd bin
#2.杀掉现有进程
kill -9 `jps -m | grep $jarName|awk '{print $1}'`
#3.删除当前包
rm $jarName
#4.cp 最新包
cp ../target/$jarName .
cp ../target/classes/application.yml app.yml
#5. 启动进程
java -jar -Dspring.config.location=./app.yml $jarName >logs/log1.log &
