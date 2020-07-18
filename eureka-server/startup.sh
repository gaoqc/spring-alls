#!/bin/bash
#kill -9 `jps -m | grep euk-ser.jar|awk '{print $1}'`
java -jar -Dspring.config.location=./app1.yml euk-ser.jar >logs/log1.log &
java -jar -Dspring.config.location=./app2.yml euk-ser.jar >logs/log2.log &
java -jar -Dspring.config.location=./app3.yml euk-ser.jar >logs/log3.log &
