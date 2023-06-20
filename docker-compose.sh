#!/bin/bash

if [[ "$(uname -m)" == "arm64" ]]; then
  export IMAGE_NAME=seleniarm
else
  export IMAGE_NAME=selenium
fi

docker-compose -f docker-compose.yml up