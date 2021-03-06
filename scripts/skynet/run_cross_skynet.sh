#!/usr/bin/env bash

set -exo pipefail

./scripts/skynet/skynet_setup.sh

export FRUGAL_HOME=$GOPATH/src/github.com/Workiva/frugal
cd ${FRUGAL_HOME}

# TODO: Move all of this to Makefile
# Remove any leftover log files (necessary for skynet-cli)
rm -rf test/integration/log/*

./scripts/integration/generate.sh

# integration tests use logrus, but frugal does not so it won't be in /vendor
go get github.com/sirupsen/logrus

# Set everything up in parallel (code generation is fast enough to not require in parallel)
go run scripts/skynet/cross/cross_setup.go

# Run cross tests - want to report any failures, so don't allow command to exit
# without cleaning up
cd ${FRUGAL_HOME}/test/integration

if go run main.go --tests tests.json --outDir log; then
    /testing/scripts/skynet/test_cleanup.sh
else
    /testing/scripts/skynet/test_cleanup.sh
    exit 1
fi
