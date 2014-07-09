android-template
================
[![Build Status](https://travis-ci.org/DiUS/android-template.png?branch=master)](https://travis-ci.org/DiUS/android-template)


An android template project with the following:

- Spock unit testing
- Junit unit tests
- Robospock/Roboelectric unit tests
- Jacoco code coverage report
- Checkstyle

Fork it and save time on iteration zero! 

Prerequisites
- Android studio  0.8.1 preview or later
- ANDROID_HOME variable is set.

### getting started
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

### Adding build flavours/buildTypes
When adding new flavours of build types the following command will automatically create the source and
res directories.

```bash
./gradlew app:createJvmSrcDirs -i
```

### Build and run all tests 
- Runs both instrumented tests within 'app' and all unit tests in the unit-test project
```bash
./gradlew clean build -i
```

## Unit Testing
The 'unit-test' module facilitates for unit testing without an emulator (non-connected). 'Connected` 
unit tests should live under <root>/app/src/androidTest.
see: [Here](http://tools.android.com/tech-docs/new-build-system/user-guide)
"This can contain unit tests, instrumentation tests, and later uiautomator tests"

### Unit Tests 
```bash
./gradlew :unit-test:test

```

### Coverage 
- After unit tests have been executed
```bash
./gradlew jacocoTestReport

```

