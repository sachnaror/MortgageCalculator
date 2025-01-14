
# Mortgage Calculator Repository Wiki

## Table of Contents
1. [Introduction](#introduction)
2. [Technologies Used](#technologies-used)
3. [File Structure](#file-structure)
4. [Service Overview](#service-overview)
5. [Setup Instructions](#setup-instructions)
6. [Future Enhancements](#future-enhancements)

---

## Introduction
This repository hosts the Mortgage Calculator application, built with **Java Spring Boot**. It supports various financial tools like loan calculation, transaction filtering, and mortgage services while employing microservices architecture.

---

## Technologies Used
- **Programming Languages**: Java
- **Frameworks**: Spring Boot, Quarkus
- **Microservices**: Docker, Kubernetes, Helm, Envoy
- **Testing Tools**: JUnit, Mockito, Cypress
- **Database**: MongoDB
- **Other Tools**: Maven, Checkmarx, Postman

---

## File Structure

```
MortgageCalculator/
├── README.md
├── .env
├── mortgage-calculator/
│   ├── docker-compose.yaml
│   ├── Dockerfile
│   ├── pom.xml
│   ├── quarkus-service/
│   │   └── pom.xml
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/example/quarkusservice/
│   │   │   │   │       ├── resources/application.properties
│   │   ├── kubernetes/
│   │   │   ├── deployment.yaml
│   │   │   ├── service.yaml
│   │   │   ├── ingress.yaml
│   │   │   └── configmap.yaml
```

---

## Service Overview

### Mortgage Calculation
Calculates monthly mortgage payments based on:
- Loan Amount
- Interest Rate
- Loan Term

### IP Address Services
Utilities for managing IP address ranges, subnet masking, and IP filtering.

---

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/sachnaror/MortgageCalculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd MortgageCalculator/mortgage-calculator
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   java -jar target/mortgage-calculator.jar
   ```

---

## Future Enhancements
- **Loan Origination Software**
- **Transaction Filters**
- **Account-to-Account Transfers**
- **Virtual Hearing Services**
