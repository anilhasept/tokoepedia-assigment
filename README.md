# REST Assured Kotlin Tutorial

## Description

This project provides a REST Assured testing written in Kotlin to perform functional testing.

## Table of Contents

1. [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Quick Start](#quick-start)
2. [Example Test Flows](#example-test-flows)


## Getting Started

### Installation

To run this project, you will need the following tools:

- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) - An integrated development environment.
- [Gradle](https://gradle.org/install/) - A build automation tool.

### Quick Start

1. Clone the project repository:

    ```shell
    git clone https://github.com/anilhasept/tokoepedia-assigment.git
    ```

2. Open the project in IntelliJ IDEA.

3. Use the following command to run the example test scenario:

    ```shell
    gradle test --tests "tokopedia.orders.TestProcessOrder.Test Proccess Order"
    ```

4. The test results will be generated in the `build/reports/tests/test` folder.

## Example Test Flows

This section describes the ReqRes Get Users List flows included in this project. The test consists of module class in `src/main/kotlin/tokopedia` and test class in `src/test/kotlin/tokopedia/orders`.

### Module Class


- **Scenario:** Check Process Order
- **Steps:**
   1. Assert the response body json

