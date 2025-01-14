

# 🚀 Mortgage Calculator (Java Spring Boot) 🔥

Your **cloud-native**, **microservices-based**, and **feature-rich** solution for scalable mortgage calculations.


![Build Status](https://img.shields.io/badge/build-passing-brightgreen) ![Contributors](https://img.shields.io/github/contributors/sachnaror/MortgageCalculator) ![Issues](https://img.shields.io/github/issues/sachnaror/MortgageCalculator)

![Mortgage Calculator](https://img.shields.io/badge/Mortgage-Calculator-blueviolet?style=for-the-badge&logo=springboot)
![Version](https://img.shields.io/badge/version-1.0.0-orange?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-23.0.1-blue?style=for-the-badge&logo=java)

# 🚀 Mortgage Calculator 🔥

![Flames](https://media.giphy.com/media/3o7abldj0b3rxrZUxW/giphy.gif)

> Your **cloud-native**, **microservices-based**, and **feature-rich** solution for scalable mortgage calculations.

[![Version](https://img.shields.io/badge/version-1.0.0-orange?style=for-the-badge)](https://github.com/sachnaror/MortgageCalculator)
[![Java](https://img.shields.io/badge/Java-23.0.1-blue?style=for-the-badge&logo=java)](https://openjdk.org)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/sachnaror/MortgageCalculator)
[![Contributors](https://img.shields.io/github/contributors/sachnaror/MortgageCalculator)](https://github.com/sachnaror/MortgageCalculator)


The **Mortgage Calculator Application** is a Spring Boot-based service designed to calculate and provide mortgage information, including loan terms, interest rates, and monthly payments. It integrates cutting-edge tools like Kubernetes, Quarkus, Helm, and Docker for modern application deployment and scalability.

---

## 🚀 Features

- Calculate mortgage payments based on user-provided inputs like loan amount, interest rate, and term.
- Store and retrieve mortgage data using MongoDB.
- Environment variables management using dotenv.
- REST API endpoints for easy interaction.
- Scalable deployment using Kubernetes.
- Lightweight microservices architecture powered by Quarkus.

---

## 📂 Directory Structure

```
├── MortgageCalculator/
│   ├── Wiki.md
│   ├── README.md
│   ├── .env
│   ├── mortgage-calculator/
│   │   ├── docker-compose.yaml
│   │   ├── Dockerfile
│   │   └── pom.xml
│   │   ├── quarkus-service/
│   │   │   └── pom.xml
│   │   │   ├── src/
│   │   │   │   ├── main/
│   │   │   │   │   ├── java/
│   │   │   │   │   │   ├── com/
│   │   │   │   │   │   │   ├── example/
│   │   │   │   │   │   │   │   ├── quarkusservice/
│   │   │   │   │   │   │   │   │   ├── resources/
│   │   │   │   │   │   │   │   │   │   └── application.properties
│   │   ├── target/
│   │   │   ├── test-classes/
│   │   │   │   ├── com/
│   │   │   │   │   ├── example/
│   │   │   │   │   │   ├── mortgagecalculator/
│   │   │   │   │   │   │   ├── MortgageServiceTest.class
│   │   │   │   │   │   │   └── MortgageControllerTest.class
│   │   │   ├── generated-sources/
│   │   │   │   └── annotations/
│   │   │   ├── classes/
│   │   │   │   ├── com/
│   │   │   │   │   ├── example/
│   │   │   │   │   │   ├── mortgagecalculator/
│   │   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   │   │   └── MortgageRepository.class
│   │   │   │   │   │   │   ├── config/
│   │   │   │   │   │   │   │   └── MongoConfig.class
│   │   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   │   └── MortgageController.class
│   │   │   │   │   │   │   ├── model/
│   │   │   │   │   │   │   │   └── MortgageData.class
│   │   │   │   │   │   │   ├── service/
│   │   │   │   │   │   │   │   └── MortgageService.class
│   │   │   ├── maven-status/
│   │   │   │   ├── maven-compiler-plugin/
│   │   │   │   │   ├── testCompile/
│   │   │   │   │   │   ├── default-testCompile/
│   │   │   │   │   │   │   └── inputFiles.lst
│   │   │   │   │   ├── compile/
│   │   │   │   │   │   ├── default-compile/
│   │   │   │   │   │   │   └── inputFiles.lst
│   │   │   ├── generated-test-sources/
│   │   │   │   └── test-annotations/
│   │   ├── kubernetes/
│   │   │   ├── deployment.yaml
│   │   │   ├── secrets.yaml
│   │   │   ├── ingress.yaml
│   │   │   ├── service.yaml
│   │   │   └── configmap.yaml
│   │   ├── src/
│   │   │   ├── docker/
│   │   │   │   ├── envoy.yaml
│   │   │   │   └── Dockerfile
│   │   │   ├── test/
│   │   │   │   ├── java/
│   │   │   │   │   ├── com/
│   │   │   │   │   │   ├── example/
│   │   │   │   │   │   │   ├── mortgagecalculator/
│   │   │   │   │   │   │   │   ├── MortgageServiceTest.java
│   │   │   │   │   │   │   │   └── MortgageControllerTest.java
│   │   │   ├── main/
│   │   │   │   ├── resources/
│   │   │   │   │   └── application.properties
│   │   │   │   │   ├── helm/
│   │   │   │   │   │   ├── Chart.yaml
│   │   │   │   │   │   └── values.yaml
│   │   │   │   │   │   ├── templates/
│   │   │   │   │   │   │   ├── deployment.yaml
│   │   │   │   │   │   │   ├── service.yaml
│   │   │   │   │   │   │   └── configmap.yaml
│   │   │   │   ├── java/
│   │   │   │   │   ├── com/
│   │   │   │   │   │   ├── example/
│   │   │   │   │   │   │   ├── mortgagecalculator/
│   │   │   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   │   │   │   └── MortgageRepository.java
│   │   │   │   │   │   │   │   ├── config/
│   │   │   │   │   │   │   │   │   └── MongoConfig.java
│   │   │   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   │   │   │   └── MortgageController.java
│   │   │   │   │   │   │   │   ├── model/
│   │   │   │   │   │   │   │   │   └── MortgageData.java
│   │   │   │   │   │   │   │   ├── service/
│   │   │   │   │   │   │   │   │   └── MortgageService.java

```

---

## 🛠️ Tools and Technologies Used

- **Java**: Core programming language.
- **Spring Boot**: Backend framework for building REST APIs.
- **MongoDB**: NoSQL database for storing mortgage data.
- **Quarkus**: Lightweight framework for microservices.
- **Kubernetes**: Deployment and orchestration tool.
- **Helm**: Package manager for Kubernetes.
- **Docker**: Containerization platform.
- **Envoy**: Service proxy for load balancing and monitoring.

---

## 💻 How It Works

1. **Input**: Users input loan amount, interest rate, and loan term.
2. **Processing**:
    - The backend calculates the monthly payment using provided details.
    - Results are saved in MongoDB.
3. **Output**: REST API returns the calculated details to the user.
4. **Scalability**:
    - Microservices are deployed and managed on Kubernetes using Helm charts.
    - Docker ensures consistent containerized environments.

---

## 📝 How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/sachinarora/mortgage-calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd MortgageCalculator
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Start the Docker container:
   ```bash
   docker-compose up
   ```
5. Access the application at `http://localhost:8080`.

---

## 📩 Contact

| Name              | Details                             |
|-------------------|-------------------------------------|
| **👨‍💻 Developer**  | Sachin Arora                      |
| **📧 Email**       | [sachnaror@gmail.com](mailto:sachnaror@gmail.com) |
| **📍 Location**    | Noida, India                       |
| **📂 GitHub**      | [github.com/sachinarora](https://github.com/sachinarora) |
| **🌐 Website**     | [https://about.me/sachin-arora](https://about.me/sachin-arora) |
| **📱 Phone**       | [+91 9560330483](tel:+919560330483) |
