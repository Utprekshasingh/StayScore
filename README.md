🏨 Hotel Rating Microservices

A complete Microservices-based Hotel Rating System built with Spring Boot, Spring Cloud Eureka, API Gateway, and MySQL.
This project demonstrates how independent microservices communicate through a service registry, API gateway, and load-balanced REST calls.
“User details include ratings and hotels fetched through chained microservice calls.”

🚀 Architecture Overview
 ┌──────────────────────────┐
 │   API GATEWAY (8084)     │
 │   Route Requests         │
 └─────────────┬────────────┘
               │
 ┌─────────────┼─────────────────────────────┐
 │            Eureka Server (8761)           │
 │  Service Registry for all microservices   │
 └───────┬──────────────┬──────────────┬─────┘
         │              │              │
 ┌───────▼──────┐ ┌─────▼────────┐ ┌───▼─────────┐
 │ UserService  │ │ HotelService │ │ RatingService│
 │ (8081)       │ │ (8082)       │ │ (8083)       │
 │ Users CRUD   │ │ Hotels CRUD  │ │ Ratings CRUD │
 └──────────────┘ └──────────────┘ └──────────────┘

🧩 Microservices Included
1️⃣ Service Registry (Eureka Server)

Registers all microservices.

Allows service discovery.

Runs on: 8761

2️⃣ API Gateway

Routing layer for all services.

Load-balancing with @LoadBalanced RestTemplate.

Runs on: 8084

3️⃣ User Service

Manages users.

Fetches hotel & rating data using REST calls.

Runs on: 8081

4️⃣ Hotel Service

Manages hotel details.

Runs on: 8082

5️⃣ Rating Service

Manages rating data for users & hotels.

Runs on: 8083

🗂 Tech Stack
Component	Technology
Language	Java 17
Framework	Spring Boot 3.x
Database	MySQL
Service Registry	Eureka
Gateway	Spring Cloud Gateway
Build Tool	Maven
