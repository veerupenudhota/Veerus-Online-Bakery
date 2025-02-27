# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file (update 'your-app.jar' accordingly)
COPY target/Veerus-Online-Bakery.jar app.jar

# Expose the application port
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "app.jar"]
