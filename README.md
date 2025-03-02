# Shopping Mall Management System - Admin Module

## 📌 Project Overview
This project implements the **Admin Module** of a Shopping Mall Management System using **Spring Boot, JPA, and RESTful APIs**. It provides efficient data management and secure access control.

## 🛠️ Technologies Used
- **Spring Boot** - Provides a robust backend with auto-configuration and embedded servers.
- **JPA (Java Persistence API)** - Simplifies database interactions with ORM capabilities.
- **REST APIs** - Ensures seamless communication between frontend and backend.

## 📂 Package Structure
com.mall.admin       # Main application package
 ├── controller      # Handles API requests
 ├── model          # Defines database entities
 ├── repository      # Manages database operations
 ├── service        # Implements business logic


## 🚀 API Endpoints

| **POST**   | `/admins/add`           | Adds a new admin                     |
| **GET**    | `/admins/list`          | Retrieves all admins                 |
| **PUT**    | `/admins/update/{id}`   | Updates an admin's details           |
| **DELETE** | `/admins/delete/{id}`   | Deletes an admin                     |

## 📊 Data Model - Admin Entity
- **ID** - Unique identifier
- **Username** - Admin's login name
- **Password** - Securely encrypted
- **Role** - Defines admin privileges

## ⚙️ Service Layer Methods
- `getAllAdmins()` - Fetches all admins from the database.
- `getAdminById(id)` - Retrieves an admin by ID.
- `createAdmin(admin)` - Adds a new admin.
- `updateAdmin(id, adminDetails)` - Updates an admin's information.
- `deleteAdmin(id)` - Removes an admin.



