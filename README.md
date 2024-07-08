[![codecov](https://codecov.io/gh/upa-io/codecov-java/branch/main/graph/badge.svg?token=MT71VTQPWV)](https://codecov.io/gh/upa-io/codecov-java)

# Codecov Java Project Documentation

Welcome to the Codecov Java Project documentation. This document aims to provide you with all the necessary information to get started with the project, understand its structure, and contribute to its development.

## Table of Contents

- [Codecov Java Project Documentation](#codecov-java-project-documentation)
  - [Table of Contents](#table-of-contents)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
  - [Project Structure](#project-structure)
  - [Reference Documentation](#reference-documentation)
  - [Building and Running](#building-and-running)
  - [Code Coverage with JaCoCo and Codecov](#code-coverage-with-jacoco-and-codecov)
    - [Generating Coverage Reports with JaCoCo](#generating-coverage-reports-with-jacoco)

## Getting Started

This project utilizes Maven for dependency management and build automation. It is structured according to standard Maven project conventions and includes integration with Spring Boot for rapid application development.

### Prerequisites

- JDK 11 or later
- Maven 3.6 or later

## Project Structure

The project follows the standard Maven project structure:

- `src/main/java/`: Application source code.
- `src/main/resources/`: Application resources (e.g., properties files).
- `src/test/java/`: Test source code.
- `target/`: Generated artifacts and compiled classes.

## Reference Documentation

For further information and reference, consider the following resources:

- [Official Apache Maven Documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.1/maven-plugin/reference/html/)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#using.devtools)

## Building and Running

To build the project, navigate to the root directory and run:

```sh
./mvnw clean install
```

## Code Coverage with JaCoCo and Codecov

This project uses JaCoCo to generate code coverage reports during the build process and integrates with Codecov to track code coverage over time, ensuring high-quality code standards.

### Generating Coverage Reports with JaCoCo

JaCoCo is configured to run with Maven's test phase, automatically generating coverage reports in the `target/site/jacoco/` directory. To generate a JaCoCo coverage report, run:

```sh
./mvnw clean test
```

```sh
./mvnw prepare-package
```

After running tests, you can find the JaCoCo coverage report in target/site/jacoco/index.html.

To view the project's code coverage reports and track coverage changes over time, visit the project's Codecov page: 

[CodeCov Dashboard](https://app.codecov.io/gh/upa-io/codecov-java)
