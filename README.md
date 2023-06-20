# Cucumber Java JUnit Platform

![Cucumber](https://img.shields.io/maven-central/v/io.cucumber/cucumber-junit-platform-engine?color=23d96c&label=cucumber&logo=cucumber&style=for-the-badge)
![Selenium Java](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?color=43B02A&label=selenium&logo=selenium&style=for-the-badge)
![Docker Compose](https://img.shields.io/github/v/tag/docker/compose?color=0db7ed&label=docker%20compose&logo=docker&logoColor=0db7ed&style=for-the-badge)

This is the demo project regarding how to execute the Cucumber scenarios using JUnit Jupiter Platform Engine.

## Prerequisites

Make sure you have installed and be configured the environment variables all the following prerequisites on your
development machine:

| OS      | JDK                                  | Maven                 | Docker Compose                 |
|---------|--------------------------------------|-----------------------|--------------------------------|
| Windows | `scoop install java/temurin-lts-jdk` | `scoop install maven` | `scoop install docker-compose` |
| macOS   | `brew install --cask temurin`        | `brew install maven`  | `brew install docker-compose`  |

## Executing the Tests

- Clone the repository.

```shell
git clone git@github.com:burakkaygusuz/cucumber-java-junit-platform.git
```

- Change the directory.

```shell
cd cucumber-java-junit-platform
```

- Execute docker-compose.sh file to starting the Selenium Grid.

```shell
./docker-compose.sh
```

- Run the test.

```shell
mvn clean test
```
