FROM openjdk:17-ea-alpine

WORKDIR /app

COPY /target/springboot-mongo-1.0.0.jar /app/springboot-mongo-1.0.0.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springboot-mongo-1.0.0.jar"]