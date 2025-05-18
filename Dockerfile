# -------- BUILD STAGE --------
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY pom.xml .                     
RUN mvn -q dependency:go-offline

COPY src ./src                     
RUN mvn -q clean package -DskipTests

# -------- RUNTIME STAGE --------
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

COPY --from=build /app/target/Veerus-Online-Bakery-0.0.1-SNAPSHOT.jar app.jar

# ⚠ Render injects $PORT; forward it to Spring
ENV SERVER_PORT=$PORT

ENTRYPOINT ["java","-jar","app.jar"]