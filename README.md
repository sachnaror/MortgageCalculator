
# 🎉 Mortgage Calculator API (Java Spring Boot) 🎉

Welcome to the **Mortgage Calculator API**! This Java Spring Boot project calculates mortgage payments and stores the results in a **MongoDB Atlas** database. 🚀

---

## 📚 Features

- 🧮 Calculate mortgage payments based on loan details.
- 🌐 Save data in a remote MongoDB Atlas database.
- 📡 RESTful APIs for data interaction.
- 🛠️ JUnit-based testing with mock services.
- 💾 Uses environment variables for configuration.

---

## 📋 Prerequisites

Make sure you have the following installed on your **Mac**:

1. **Java 23.0.1+**
   Check your version:
   ```bash
   java -version
   ```

2. **Maven**
   Install Maven if you don’t have it:
   ```bash
   brew install maven
   ```

3. **MongoDB Atlas Account**
   Use the provided URI for remote database access.

4. **A Fun Attitude**
   No code runs without a smile! 😄

---

## 🚀 Getting Started

### 1️⃣ Clone the Project

```bash
git clone https://github.com/sachnaror/MortgageCalculator.git
cd MortgageCalculator
```

### 2️⃣ Set Up Environment Variables

Create a `.env` file in the root directory and add:

```env
PORT=3000
MONGO_URI=mongodb+srv://atlasAdmin:schnaror@mortgagecalc.cfa3m.mongodb.net/?retryWrites=true&w=majority&appName=mortgagecalc
```

### 3️⃣ Install Dependencies

Run the following command to install dependencies:
```bash
mvn clean install
```

### 4️⃣ Directory Structure

Your project will look like this:
```
mortgage-calculator/
├── .env
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── mortgagecalculator/
│   │   │               ├── controller/
│   │   │               │   └── MortgageController.java
│   │   │               ├── model/
│   │   │               │   └── MortgageData.java
│   │   │               ├── repository/
│   │   │               │   └── MortgageRepository.java
│   │   │               ├── service/
│   │   │               │   └── MortgageService.java
│   │   │               ├── config/
│   │   │               │   └── MongoConfig.java
│   │   └── resources/
│   │       ├── application.properties
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── mortgagecalculator/
│       │               ├── MortgageServiceTest.java
│       │               └── MortgageControllerTest.java
```

### 5️⃣ Run the Application

```bash
mvn spring-boot:run
```

---

## 🛠️ API Documentation

### POST `/api/mortgage/calculate`

- **Description**: Calculate mortgage and save it to the database.
- **Payload**:
  ```json
  {
    "loanAmount": 300000,
    "interestRate": 3.5,
    "loanTerm": 30,
    "creditScore": "Good",
    "propertyType": "Residential"
  }
  ```
- **Response**:
  ```json
  {
    "id": "12345",
    "loanAmount": 300000,
    "interestRate": 3.5,
    "loanTerm": 30,
    "adjustedInterestRate": 4.0,
    "monthlyPrincipalAndInterest": 1432.25,
    ...
  }
  ```

---

## 🧪 Testing

We use **JUnit** and **Mockito** for unit testing. Run tests using:
```bash
mvn test
```

### Example Test Case

File: `MortgageServiceTest.java`
- Validates mortgage calculation and saves it using a mocked repository.

---

## 🛠️ Fun Fact

Why did the developer break up with their girlfriend?
She didn't "get" arrays. 🤓

---

## 💬 Feedback

We’d love to hear your thoughts! Create an issue or open a pull request.

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


Happy Coding! 💻✨
