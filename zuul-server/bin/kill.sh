#!/bin/bash
kill -9 `jps -m | grep zuul-server-1.0.0.jar|awk '{print $1}'`
