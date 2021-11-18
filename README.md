# Cucumber Java JUnit Platform

![Cucumber](https://img.shields.io/maven-central/v/io.cucumber/cucumber-junit-platform-engine?color=23d96c&label=cucumber&logo=cucumber&style=for-the-badge)
![Selenium Java](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?color=43B02A&label=selenium&logo=selenium&style=for-the-badge)
![Docker Compose](https://img.shields.io/github/v/tag/docker/compose?color=0db7ed&label=docker%20compose&logo=docker&logoColor=0db7ed&style=for-the-badge)

This is the demo project regarding how to execute the Cucumber scenarios using JUnit Jupiter Platform Engine.

## Requirements

Make sure you have installed and be configured the environment variables all the following prerequisites on your
development machine:

| OS      | Java JDK                      | Maven                 |
| ------- | ----------------------------- | --------------------- |
| Windows | `choco install temurin17`     | `choco install maven` |
| Linux   | `brew install --cask temurin` | `brew install maven`  |

- Install [Docker Compose](https://docs.docker.com/compose/install/) .

## Executing the Tests

- Clone the repository.

```git
git clone git@github.com:burakkaygusuz/cucumber-java-junit-platform.git
```

- Change the directory.

```sh
cd cucumber-java-junit-platform
```

- Execute the .yml file to starting the Selenium Grid.

```sh
docker-compose -f docker-compose-v3.yml up
```

- Run the test.

```mvn
mvn clean test
```
