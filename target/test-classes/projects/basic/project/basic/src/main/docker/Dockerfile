FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ${parentArtifactId}/basic/target/basic-0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=test"]