FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final runtime image
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/Student*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]


