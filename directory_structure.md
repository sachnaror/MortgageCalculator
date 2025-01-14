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
