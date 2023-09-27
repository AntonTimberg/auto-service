FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY src/main/java /app

RUN ./gradlew build

CMD ["java", "-jar", "build/libs/auto-service.jar"]