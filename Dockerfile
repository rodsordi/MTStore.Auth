FROM openjdk:17-alpine

RUN mkdir -p app

COPY ./MTS.Auth.SpringApp/target/Autenticacao.SpringApp.jar /app

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "Autenticacao.SpringApp.jar"]