# 🚀 Blog Platform API - Spring Boot

## 📌 Overview

This project is a **RESTful Blog Platform API** built with **Spring Boot**, providing a backend system for managing blog posts, user interactions, and authentication.

The system follows a **layered architecture (Controller – Service – Repository)** and uses **JWT-based authentication** for secure access control.

👉 The application has been **deployed to the cloud** and is publicly accessible for testing.

---

## 🌐 Live Demo

🔗 Base URL:
`https://reviewfood-h4j4.onrender.com`

⚠️ Note:

* The application is hosted on a **free cloud service**, so it may take **20–50 seconds to wake up** if idle.
* Please be patient on the first request.

---

## ✨ Features

### 🔐 Authentication

* User registration
* User login with JWT
* Role-based authorization (ADMIN / USER)

---

### 👤 User Features (Public Testing)

* View all posts
* View post details
* Comment on posts
* React to posts (LIKE, LOVE, ANGRY)

---

### 📝 Admin Features (Private)

* Create posts
* Update posts
* Delete posts

⚠️ Admin functionality is **restricted** and used only by the system owner (personal blog management).

---

### 💬 Interaction System

* Comment system linked to posts
* Reaction system (**1 user = 1 reaction per post**)
* Dynamic interaction handling

---

## 🏗️ System Architecture

```
Controller → Service → Repository → Database
```

* **Controller**: Handles HTTP requests
* **Service**: Business logic processing
* **Repository**: Database interaction using Spring Data JPA

---

## 🛠️ Tech Stack

* **Java 21**
* **Spring Boot**
* **Spring Security**
* **JWT Authentication**
* **Spring Data JPA**
* **PostgreSQL (Production - Render)**
* **MySQL (Local Development)**
* **Docker**
* **Maven**

---

## 🔐 Authentication & Authorization

* Uses **JWT (JSON Web Token)** for authentication
* Role-based access control:

  * `ADMIN`: Full access (not publicly available)
  * `USER`: Read and interact with content

---

## 📡 API Endpoints

### 🔑 Authentication

```
POST /api/auth/register
POST /api/auth/login
```

---

### 📝 Posts

```
GET  /api/posts
```

---

### 💬 Comments

```
GET  /api/comments/{postId}
POST /api/comments/{postId}
```

---

### ❤️ Reactions

```
POST /api/reactions/{postId}?type=LIKE
```

---

## 🧪 How to Test the API

You can test the deployed API using **Postman** or any API client.

---

### 1. Register a new user

```
POST https://your-app.onrender.com/api/auth/register
```

---

### 2. Or use test account

```json
{
  "email": "test@gmail.com",
  "password": "123456"
}
```

---

### 3. Login

```
POST https://your-app.onrender.com/api/auth/login
```

👉 Copy the JWT token from response

---

### 4. Authorized requests

Add header:

```
Authorization: Bearer <your_token>
```

---

### 5. Test user features

* View posts
* Comment on posts
* React to posts

---

## ☁️ Deployment

The application is deployed using:

* **Render (Cloud Platform)**
* **Docker containerization**
* **PostgreSQL (Cloud Database)**

👉 The backend is fully deployed and accessible via public API endpoints.

---

## 📈 Future Improvements

* Pagination for posts
* Search & filtering
* Post categories & tags
* Image upload
* Notification system
* Real-time interactions (WebSocket)
* Swagger API documentation
* Frontend UI (planned)

---

## 👨‍💻 Author

**Nguyen Minh Huy**
🔗 GitHub: https://github.com/nguyenminhhuy139
