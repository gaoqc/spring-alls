#!/bin/bash
kill -9 `jps -m | grep euk-ser.jar|awk '{print $1}'`
