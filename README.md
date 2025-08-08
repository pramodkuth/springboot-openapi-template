# Spring Boot + OpenAPI Template

A clean, versioned Spring Boot template for building RESTful APIs with Swagger (Springdoc OpenAPI), grouped documentation, and custom headers — perfect for microservices or API-first projects.

---

## 🚀 Features

- ✅ Spring Boot 3.x
- ✅ OpenAPI 3.1 with Springdoc
- ✅ API versioning (`/v1`, `/v2`) via `GroupedOpenApi`
- ✅ Custom headers (e.g. `X-B3-Span-Id`) documented in Swagger
- ✅ Shared metadata (contact, license, etc.) across versions

---
## 📚 API Documentation

- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- OpenAPI JSON:
    - [http://localhost:8080/api-docs/v1](http://localhost:8080/api-docs/v1)
    - [http://localhost:8080/api-docs/v2](http://localhost:8080/api-docs/v2)
---

## 📦 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+

### Run the App

```bash
./mvnw clean
./mvnw spring-boot:run
