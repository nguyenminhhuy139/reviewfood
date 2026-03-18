# Blog Platform API - Spring Boot

## Overview
This project is a RESTful API built using **Spring Boot** for a simple blog platform.  
The system allows administrators to manage posts while users can browse posts, react to them, and leave comments.

The backend follows a **layered architecture (Controller – Service – Repository)** and uses **JWT-based authentication** for secure access control.

---

## Features

### Admin
- Create new posts
- Update existing posts
- Delete posts
- Manage published content

### User
- View all posts
- View post details
- React to posts (like, love, etc.)
- Comment on posts

---

## System Architecture

- **Controller**: Handles HTTP requests and responses  
- **Service**: Contains business logic  
- **Repository**: Handles database operations using Spring Data JPA  

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- MySQL
- Maven
- Docker (optional)

---

## Authentication

The system uses **JWT authentication**.
Only **admin users** are allowed to create, update, or delete posts.

---

## API Endpoints

### Authentication
POST /api/auth/register
POST /api/auth/login

### Posts
POST /api/posts (admin only)


---

## Installation

### 1. Clone repository
git clone https://github.com/yourusername/blog-api.git

### 2. Configure database

Update `application.properties`:
spring.datasource.url=jdbc:mysql://localhost:3306/blog_db
spring.datasource.username=root
spring.datasource.password=yourpassword

### 3. Run the application
mvn spring-boot:run

---

## API Testing

You can test the APIs using:
- Postman
- Swagger (will be update)

---

## Future Improvements

- Post categories and tags
- Comment, share and like
- Pagination for posts
- Image upload for posts
- Notification system
- Real-time comments

---

## Author

Nguyen Minh Huy  
GitHub: https://github.com/nguyenminhhuy139

