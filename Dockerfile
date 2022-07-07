FROM openjdk:17-alpine

RUN mkdir -p app

COPY ./MTS.Auth.Web/target/MTS.Auth.App.jar /app

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "MTS.Auth.App.jar"]