# Management System

A Java Swing-based Management System with CRUD (Create, Read, Update, Delete) functionality.

## Features

- **Read**: Retrieve data from the system.
- **Write**: Add new data to the system.
- **Update**: Modify existing data in the system.
- **Delete**: Remove data from the system.

## Prerequisites

Ensure that you have the following prerequisites installed before running the project:

- Java 8 or later
- MySQL database
- NetBeans (optional, for design)
- Any other specific dependencies

## Getting Started

To get started with the Management System:

1. Clone the repository:

https://github.com/RashanWeerasinghe/management-system.git


2. Set up the database:

- Create a MySQL database and configure the connection details in `config.properties`.
- Initialize the database schema using the provided SQL scripts.

3. Compile and run the project:


## Usage

Use the Management System to manage your data efficiently. Follow the CRUD operations to interact with the system.

## MVC Architecture

The project follows the Model-View-Controller (MVC) pattern for clean separation of concerns. 

- **Model**: Handles data logic and database interactions.
- **View**: Represents the user interface designed with `javax.swing.UIManager`.
- **Controller**: Manages user input and controls the flow of data between the Model and View.

## Database (MySQL JDBC)

MySQL JDBC is used for database connectivity. SQL queries and data models are implemented to manage data efficiently.

## Design with NetBeans

The user interface is designed using NetBeans and `javax.swing.UIManager`. It includes various UI components, layouts, and styling for an intuitive user
## Contributing

We welcome contributions! If you'd like to contribute to the Management System, please follow our contribution guidelines.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
