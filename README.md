# PrimeTrade_Assignment - Scalable REST API with Authentication & Dashboard

A full-stack web application built as a Backend Developer assignment.

This project demonstrates:

- Secure JWT Authentication
- Role-Based Access Control (USER / ADMIN)
- Full CRUD operations
- Scalable Spring Boot backend
- React frontend integration
- Cloud deployment (Railway + Vercel)

---

## Live Demo

### Frontend
https://primetrade-assign.vercel.app

### Backend API
https://primetradebackend-production.up.railway.app/api/v1

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- MySQL (Railway)
- Maven

### Frontend
- React.js
- Axios
- React Router

### Deployment
- Backend: Railway
- Frontend: Vercel
- Database: Railway MySQL

---

## Authentication & Roles

- User Registration
- User Login
- Password hashing using BCrypt
- JWT-based authentication
- Role-based authorization

Roles:

- USER 
- ADMIN 

---

## API Endpoints

### Auth

| Method | Endpoint | Description |

| POST | /api/v1/auth/register | Register user |
| POST | /api/v1/auth/login | Login & get JWT |


### Tasks (Protected)

| Method | Endpoint | Description |

| GET | /api/v1/tasks | Get all tasks |
| POST | /api/v1/tasks | Create task |
| PUT | /api/v1/tasks/{id} | Update task |
| DELETE | /api/v1/tasks/{id} | Delete task |


### Admin Only

| Method | Endpoint |

| GET | /api/v1/tasks/admin |



## Project Structure
# PrimeTrade - Scalable REST API with Authentication & Dashboard

A full-stack web application built as a Backend Developer assignment.

This project demonstrates:

- Secure JWT Authentication
- Role-Based Access Control (USER / ADMIN)
- Full CRUD operations
- Scalable Spring Boot backend
- React frontend integration
- Cloud deployment (Railway + Vercel)

---

## Live Demo

### Frontend
https://primetrade-assign.vercel.app

### Backend API
https://primetradebackend-production.up.railway.app/api/v1

---

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Security
- JWT Authentication
- MySQL (Railway)
- Maven

### Frontend
- React.js
- Axios
- React Router

### Deployment
- Backend: Railway
- Frontend: Vercel
- Database: Railway MySQL

---

## Authentication & Roles

- User Registration
- User Login
- Password hashing using BCrypt
- JWT-based authentication
- Role-based authorization

Roles:

- USER → normal task access
- ADMIN → admin-only endpoints

---

## API Endpoints

### Auth

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/v1/auth/register | Register user |
| POST | /api/v1/auth/login | Login & get JWT |

---

### Tasks (Protected)

| Method | Endpoint | Description |
|---|---|---|
| GET | /api/v1/tasks | Get all tasks |
| POST | /api/v1/tasks | Create task |
| PUT | /api/v1/tasks/{id} | Update task |
| DELETE | /api/v1/tasks/{id} | Delete task |

---

### Admin Only

| Method | Endpoint |
|---|---|
| GET | /api/v1/tasks/admin |

---

## Project Structure

backend
┣ config
┣ controller
┣ dto
┣ entity
┣ repository
┣ security
┣ service
┗ PrimetradeApplication

frontend
┣ api
┣ pages
┣ App.js

backend
┣ config
┣ controller
┣ dto
┣ entity
┣ repository
┣ security
┣ service
┗ PrimetradeApplication

frontend
┣ api
┣ pages
┣ App.js

##Author

Suensa Maharathi
