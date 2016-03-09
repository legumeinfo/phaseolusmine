#!/bin/sh
date > started
cd dbmodel
./go
cd ../integrate
./go
cd ../postprocess
./go
cd ../webapp
./go
cd ..
date > ended
