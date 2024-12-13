# Investor-User   Connection Platform

This is a web application that connects investors with users looking for investment opportunities. It allows users to register, log in, and manage their profiles, while investors can also register and manage their investment details.

## Features

- User registration and login
- Investor registration and login
- Profile management for both users and investors
- Connection history for users

## Technologies Used

- Java Servlet
- JSP
- JDBC for database connectivity
- MySQL for the database
- Maven for dependency management

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or above
- Apache Tomcat or another servlet container
- MySQL database

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/investor-user-platform.git
    cd investor-user-platform
    ```

2. Update the `db.properties` file with your MySQL credentials:
    ```properties
    db.url=jdbc:mysql://localhost:3306/investor_user_db
    db.user=your_username
    db.password=your_password
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Deploy the generated WAR file in the `target` directory to your servlet container (e.g., Tomcat).

5. Start your servlet container and access the application at:
    ```
    http://localhost:8080/investor-user-platform/
    ```

## Usage

1. **Registering a User**:
   - Navigate to the registration page (`register.jsp`).
   - Fill in the required fields (username, password, email, profile details) and submit the form.

2. **Logging In**:
   - Go to the login page (`login.jsp`).
   - Enter your username and password to log in.

3. **Managing Your Profile**:
   - Once logged in, you can view and update your profile details on the `profile.jsp` page.

4. **Investors**:
   - Investors can register and manage their investment details similarly on their respective pages.

5. **Viewing Connection History**:
   - Users can view their connection history on the `connectionHistory.jsp` page.

## Database Setup

To set up the database, you can execute the following SQL commands to create the necessary tables:

```sql
CREATE DATABASE investor_user_db;

USE investor_user_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    profileDetails TEXT
);

CREATE TABLE investors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    investmentDetails TEXT
);

CREATE TABLE connections (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId INT,
    investorId INT,
    meetingLink VARCHAR(255),
    date DATETIME,
    FOREIGN KEY (userId) REFERENCES users(id),
    FOREIGN KEY (investorId) REFERENCES investors(id)
);
