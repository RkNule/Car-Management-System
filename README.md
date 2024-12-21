# Car Management System

## Project Description

The **Car Management System** is a Spring Boot-based backend project designed to manage car inventory. It supports CRUD operations, allowing users to add, view, update, and delete car details. The project integrates Swagger for API documentation and testing.

## Features

- Add new cars to the inventory.
- View all cars or details of a specific car.
- Update existing car information.
- Delete cars from the inventory.

## Prerequisites

To run this project locally, ensure the following tools are installed:

- **Java JDK** (version 8 or higher)
- **Spring Boot**
- **Maven**
- **MySQL** (or another relational database)
- **Git**

## Setup Instructions

### Step 1: Clone the Repository

```bash
git clone https://github.com/RkNule/Car-Management-System.git
cd Car-Management-System
```

### Step 2: Configure the Database

1. Create a database named `carmanagement` in your MySQL server.
2. Update the `application.properties` file in the `src/main/resources` directory with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/carmanagement
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   ```

### Step 3: Build and Run the Project

1. Open a terminal and navigate to the project directory.
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. The application will start on `http://localhost:8080`.

## API Documentation

### Swagger UI

The project uses Swagger for API documentation and testing. Once the application is running, access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

### Sample Endpoints

1. **Add a New Car** (POST): `/api/cars`
   ```json
   {
     "name": "Toyota Corolla",
     "brand": "Toyota",
     "color": "White",
     "fuelType": "Petrol",
     "price": 15000.0
   }
   ```
2. **Get All Cars** (GET): `/api/cars`
3. **Update a Car** (PUT): `/api/cars/{id}`
   ```json
   {
     "name": "Toyota Camry",
     "brand": "Toyota",
     "color": "Black",
     "fuelType": "Diesel",
     "price": 18000.0
   }
   ```
4. **Delete a Car** (DELETE): `/api/cars/{id}`

## Screenshots

### Swagger UI



## Contribution/Contact

For queries or contributions, feel free to contact:

- **Email**: [rohannule02@gmail.com](mailto\:rohannule02@gmail.com)
- **GitHub**: [RkNule](https://github.com/RkNule)

---

Thank you for using the Car Management System!



