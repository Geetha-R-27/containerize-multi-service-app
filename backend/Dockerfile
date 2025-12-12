# builder
FROM maven:3.8.8-eclipse-temurin-17 AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn -B -q dependency:go-offline
COPY src ./src
RUN mvn -B -DskipTests package

# runtime
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=builder /build/target/*.jar app.jar
EXPOSE ${BACKEND_PORT}
ENTRYPOINT ["java","-jar","/app/app.jar"]
