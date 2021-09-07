# Cucumber Java JUnit Platform

![Cucumber](https://img.shields.io/maven-central/v/io.cucumber/cucumber-junit-platform-engine?color=23d96c&label=cucumber&logo=cucumber&style=for-the-badge) ![Selenium Java](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?color=43B02A&label=selenium&logo=selenium&style=for-the-badge)


This is the demo project regarding how to execute the Cucumber scenarios using JUnit Jupiter Platform Engine.

## Requirements

Make sure you have installed and be configured the environment variables all the following prerequisites on your development machine:

| OS      | Java JDK                              | Maven                     |
| ------- | ------------------------------------- | ------------------------- |
| Windows | ```choco install openjdk11```         | ```choco install maven``` |
| Ubuntu  | ```sudo apt install openjdk-11-jdk``` | ```sdk install maven```   |
| macOS   | ```brew install openjdk@11```         | ```brew install maven```  |


- Download the latest [Selenium Server Grid](https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.0.0-rc-1/selenium-server-4.0.0-rc-1.jar) .jar file.

## Executing the Tests

- Clone the repository.

```git
$ git clone git@github.com:burakkaygusuz/cucumber-java-junit-platform.git 
```

- Change the directory.

```sh
$ cd cucumber-java-junit-platform
```

- Start the Selenium Grid as standalone mode.

```java
$ java -jar selenium-server-4.0.0-rc-1.jar standalone
```

- Run the test.

```mvn
$ mvn clean test
```






