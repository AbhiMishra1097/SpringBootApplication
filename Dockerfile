FROM openjdk:21
WORKDIR /app
COPY target/projects-0.0.1-SNAPSHOT.jar app/projects-0.0.1-SNAPSHOT.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","projects-0.0.1-SNAPSHOT.jar"]