# Use an official OpenJDK runtime as a parent image
FROM openjdk:23-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/helloworld-0.0.1-SNAPSHOT.jar app.jar


EXPOSE 3400

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
