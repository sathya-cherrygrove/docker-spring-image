FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /target/docker-spring-image-0.0.1-SNAPSHOT.jar testsat.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/testsat.jar"]

