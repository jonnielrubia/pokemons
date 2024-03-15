
# Build Stage
FROM ubuntu:latest AS build

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

# Copy the entire project (assuming the Dockerfile is in the project root)
COPY . .

# Ensure that the gradlew script has executable permissions
RUN chmod +x gradlew

# Build the Spring Boot application
RUN ./gradlew bootJar --no-daemon

# Runtime Stage
FROM openjdk:17-jdk-slim

# Expose the port that your application is running on
EXPOSE 8081

# Copy the generated JAR file from the build stage
COPY --from=build /build/libs/pokemons-0.0.1-SNAPSHOT.jar app.jar

# Command to run the application
ENTRYPOINT ["java","-jar","app.jar"]