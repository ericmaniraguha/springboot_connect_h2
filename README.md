# Spring Boot Connect to H2 Database Examples

This repository contains examples of how to connect a Spring Boot application to an H2 database. H2 is an in-memory database that is often used for development and testing purposes.

## Prerequisites

Before you begin, ensure you have the following:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Spring Boot](https://spring.io/projects/spring-boot) installed or managed by your project's build tool (Maven or Gradle)

## Dependencies

The following dependencies are used in this project:

- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Data JPA
- H2 Databases
- Spring Boot Starter Test (for testing)

## Getting Started

Follow these steps to set up the project and see the examples in action:

1. Clone this repository:

   ```sh
   git clone https://github.com/ericmaniraguha/springboot_connect_h2.git

   # Access the Application

Open a web browser and go to [http://localhost:8080](http://localhost:8080). You should see the application's landing page.

## Examples

1. **Employee Entity**

   This example demonstrates how to create an `Employee` entity and connect it to the H2 database. The entity represents employee information, including details such as first name, last name, department, position, and salary.

2. **Employee Repository**

   This example shows how to create a repository for the `Employee` entity using Spring Data JPA. The repository provides basic CRUD operations and database interaction for the `Employee` entity.

3. **Employee Service**

   The `EmployeeService` class contains business logic for performing CRUD operations on employee data. It interacts with the `EmployeeRepository` to manage employee records.

4. **Employee Controller**

   The `EmployeeController` class sets up RESTful endpoints for managing employee data. It handles HTTP requests and communicates with the `EmployeeService` to perform operations such as fetching, creating, updating, and deleting employee records.

## Usage

You can explore each example by reviewing the respective source code files. Feel free to modify, extend, or integrate these examples into your own Spring Boot projects.

## Contributing

If you find any issues or have suggestions for improvements, feel free to create an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Happy coding!


