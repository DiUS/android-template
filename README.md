android-template
================
[![Build Status](https://travis-ci.org/DiUS/android-template.png?branch=master)](https://travis-ci.org/DiUS/android-template)


An android template project with the following:

- Spock unit testing
- Junit unit tests
- Robospock/Roboelectric unit tests

Fork it and save time on iteration zero! 

Prerequisites
- Android studio  0.6.1 or later
- ANDROID_HOME variable is set.

## getting started
- Fork or clone this repo
- Run the following to pull in all external dependencies:

```bash
./graldew clean build
```

- Import the project into android studio: File >> Open >> ..../android-template/build.gradle
- Rename the application id/package in /app/build.gradle

```groovy
ext{
  projectPackageName = "au.com.dius.android.template"
}

```

- Refactor the existing classes packaging to match your application 
__or__
Delete everything under app/src and run `./gradlew createJvmSrcDirs -i` to recreate src dirs and packages

## Adding build flavours/buildTypes
When adding new flavours of build types the following command will automatically create the source and
res directories.

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

