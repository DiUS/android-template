android-template
================


## Adding build flavours/buildTypes
To create the new directory structure run:

```bash

./gradlew createJvmSrcDirs -i
```

## Build and run all tests 
- Runs both instrumented tests within 'app' and all unit tests in the unit-test project
```bash
./gradlew clean build -i
```

## Unit Tests 
```bash
./gradlew :unit-test:test

```

