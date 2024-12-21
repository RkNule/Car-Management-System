# Car Management System

## Project Overview:
The Car Management System is a backend application built with Spring Boot. It allows users to manage car details such as name, model, year, price, and other attributes. The application provides RESTful API endpoints for CRUD operations on car data, including the ability to search cars globally.

## Tech Stack:
- **Spring Boot**: Backend framework
- **MySQL**: Database
- **Swagger**: API documentation and testing
- **Hibernate**: ORM for database interaction
- **Maven**: Build automation tool

## API Endpoints:
### 1. `GET /api/cars`
- Get a list of all cars with pagination and sorting.
  
### 2. `POST /api/cars`
- Add a new car.

### 3. `GET /api/cars/{id}`
- Get details of a car by its ID.

### 4. `PUT /api/cars/{id}`
- Update an existing car.

### 5. `DELETE /api/cars/{id}`
- Delete a car by its ID.

### 6. `GET /api/cars/search`
- Search cars by a keyword.

## How to Run the Project:
1. Clone the repository:
   ```bash
   git clone https://github.com/RkNule/Car-Management-System.git
