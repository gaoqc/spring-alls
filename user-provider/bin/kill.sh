#!/bin/bash
kill -9 `jps -m | grep user-provider-1.0.0.jar|awk '{print $1}'`
