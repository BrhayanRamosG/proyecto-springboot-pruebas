# the base image
FROM openjdk:17-jdk-alpine

# JAR file path
ARG JAR_FILE=target/*.jar

# Copy the JAR file from the build context into the Docker image
COPY ${JAR_FILE} productos-service.jar

# Set the default command to run the Java application
ENTRYPOINT ["java", "-jar", "/productos-service.jar"]