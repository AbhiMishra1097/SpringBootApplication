FROM openjdk:21-slim
WORKDIR /app
COPY target/*.jar app/projects.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","projects.jar"]