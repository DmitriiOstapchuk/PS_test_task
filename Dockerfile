FROM eclipse-temurin:21

RUN mkdir /opt/app

COPY ./target/testProject-0.0.1-SNAPSHOT.jar /opt/app

COPY ./src/main/resources/templates ./templates

ENTRYPOINT ["java", "-jar", "opt/app/testProject-0.0.1-SNAPSHOT.jar", "--spring.datasource.url=jdbc:postgresql://postgres-db:5434/postgres"]