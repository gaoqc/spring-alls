#!/bin/bash
#1. 重新打包编译
cd ../
mvn package -Dmaven.test.skip=true
cd bin
#2.杀掉现有进程
kill -9 `jps -m | grep user-provider-1.0.0.jar|awk '{print $1}'`
#3.删除当前包
rm user-provider-1.0.0.jar
#4.cp 最新包
cp ../target/user-provider-1.0.0.jar .
#5. 启动进程
java -jar -Dspring.config.location=./app1.yml user-provider-1.0.0.jar >logs/log1.log &
java -jar -Dspring.config.location=./app2.yml user-provider-1.0.0.jar >logs/log2.log &
java -jar -Dspring.config.location=./app3.yml user-provider-1.0.0.jar>logs/log3.log &
