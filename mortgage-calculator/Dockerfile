# Step 1: Use an appropriate base image for Java 23
FROM openjdk:23-jdk-slim AS build

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the application jar and other necessary files to the container
COPY target/mortgage-calculator-1.0.0.jar app.jar

# Step 4: Expose the port the application runs on
EXPOSE 8080

# Step 5: Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
