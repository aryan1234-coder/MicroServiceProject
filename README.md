# Hotel Rating Microservices System

This is a microservices-based project where users can rate hotels, and hotels can view the ratings provided by users. The system uses multiple services with different technologies for storage and service management.

## 🏗️ Project Structure

The system is composed of the following microservices:

1. **API Gateway**  
   - Acts as the single entry point for all client requests.
   - Handles routing and service forwarding.

2. **Config Server**  
   - Centralized configuration management for all services.

3. **Eureka Registry Service**  
   - Service discovery for all microservices using Netflix Eureka.

4. **User Service**  
   - Handles user data.
   - Tech stack: Java + Spring Boot + MySQL

5. **Hotel Service**  
   - Manages hotel information.
   - Tech stack: Java + Spring Boot + PostgreSQL

6. **Rating Service**  
   - Manages ratings submitted by users for hotels.
   - Tech stack: Java + Spring Boot + MongoDB

---

## 🧩 Technologies Used

- **Spring Boot**
- **Spring Cloud (Eureka, Config Server, API Gateway)**
- **MySQL** for UserService
- **PostgreSQL** for HotelService
- **MongoDB** for RatingService
- **RestTemplate / Feign Clients** for inter-service communication

---

## 🧬 Architecture Overview

