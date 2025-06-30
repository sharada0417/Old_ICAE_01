# Past ICAE1 – Workshop Management System (Backend)

A Spring Boot & MySQL–based backend service for managing university workshops, sessions, presenters and student participation. This service defines JPA entities, CRUD repositories, service layers, and REST controllers to support all administrative operations.

## 🛠️ Technology Stack
- **Java 17**
- **Spring Boot 3.x**
  - Spring Data JPA
  - Spring Web
- **MySQL 8.x** (or compatible)
- **Maven** for build and dependency management
- **HikariCP** for connection pooling
- **Hibernate ORM 6.x**

## ✅ Features
- **Workshop** CRUD
- **Session** CRUD
- **Presenter** CRUD
- **PostGraduate** & **UnderGraduate** CRUD
- **Many-to-many** session assignments for presenters & students
- **Database migration** via JPA auto-DDL
- **Backup** and **table inspection** scripts

## 🔧 Prerequisites
- Java 17+ installed and `JAVA_HOME` configured
- MySQL server running (v8.0+)
- Maven 3.6+

## ⚙️ Setup & Configuration

### 1. Clone Repository
```bash
git clone https://github.com/yourorg/past-icae1-backend.git
cd past-icae1-backend
```

### 2. Configure MySQL
Create database:
```sql
CREATE DATABASE unisession CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```

Grant user privileges or update `application.yml` with your credentials.

### 3. Configure Spring Boot – `src/main/resources/application.yml`
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/unisession
    username: your_db_user
    password: your_db_password
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.MySQL8Dialect
server:
  port: 8080
```

## 🧠 JPA Entities & Relationships

### Workshop
- Fields: `id`, `name`, `description`, `startDate`, `endDate`
- Relationship:
  - `@OneToMany` → `Session`

### Session
- Fields: `id`, `name`, `description`, `date`, `time`, `workshop`
- Relationships:
  - `@ManyToOne` → `Workshop`
  - `@ManyToMany` → `Presenter`
  - `@ManyToMany` → `PostGraduate`
  - `@ManyToMany` → `UnderGraduate`

### Presenter
- Fields: `id`, `name`, `email`, `gender`, `phone`, `affiliation`, `country`, `jobTitle`
- Relationship:
  - `@ManyToMany` → `Session`

### PostGraduate
- Fields: `id`, `name`, `email`, `gender`, `phone`, `institute`, `researchInterest`, `secondDegree`
- Relationship:
  - `@ManyToMany` → `Session`

### UnderGraduate
- Fields: `id`, `name`, `email`, `gender`, `phone`, `degree`, `university`
- Relationship:
  - `@ManyToMany` → `Session`

## ▶️ Running the Application
```bash
mvn clean install
mvn spring-boot:run
```

Application will start at: `http://localhost:8080`

## 💾 Database Tables (Auto Generated)
- `workshop`
- `session`
- `presenter`
- `post_graduate`
- `under_graduate`
- `presenter_sessions`
- `postgraduate_sessions`
- `under_graduate_sessions`

## 📂 Project Structure
```
src/
 └── main/
     ├── java/
     │   └── com/example/demo/
     │       ├── model/
     └── resources/
         ├── application.yml
         
```
