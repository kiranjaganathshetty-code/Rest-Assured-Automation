Project Description

This project is a Java-based API Automation Framework designed to automate RESTful API testing using REST Assured, TestNG, and Maven, with seamless CI/CD integration using Jenkins.
The framework follows a modular and scalable architecture, enabling efficient testing of GET, POST, and Authentication APIs with automated execution and reporting.

The primary objective of this framework is to ensure API reliability, correctness, and security by validating request parameters, response payloads, status codes, and authentication mechanisms, while enabling continuous testing in CI/CD pipelines.

Framework Architecture

The framework is structured to promote reusability, maintainability, and scalability:

Base Layer
Centralizes common configurations such as base URI setup using a base test class.

Test Layer
Contains dedicated test classes for different API types:

GET API validation

POST API payload validation

Authentication (Basic Auth) testing

Utility Layer
Manages request payloads and test data separately to keep test logic clean and maintainable.

TestNG Configuration
Controls suite execution, test grouping, and future scalability like parallel execution.
