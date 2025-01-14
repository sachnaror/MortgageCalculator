
# Mortgage Calculator Application

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
