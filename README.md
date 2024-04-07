# Student Management System

This is a simple student management system built using Spring Boot and MySQL. It allows you to perform CRUD operations on student entities.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Installing

1. Clone the repository
```
git clone https://github.com/yourusername/student-management-system.git
```
2. Change directory
```
cd student-management-system
```
3. Run the application
```
mvn spring-boot:run
```
The application will start running at `http://localhost:8080`.

## Usage

The application exposes the following endpoints:

- `GET /students`: Fetch all students
- `GET /students/{id}`: Fetch a student by id
- `POST /students`: Create a new student
- `PUT /students/{id}`: Update a student by id
- `DELETE /students/{id}`: Delete a student by id

## Running the tests

To run the tests, use the following command:

```
mvn test
```

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency Management
- [MySQL](https://www.mysql.com/) - Used to store student data

## Authors

- Your Name

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

- Hat tip to anyone whose code was used
- Inspiration
- etc.# Spring_Swag-with-Swagger_UI
