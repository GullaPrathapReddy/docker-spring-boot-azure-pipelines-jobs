FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-app.jar spring-boot-docker-app.jar
ENTRYPOINT [ "JAVA" ,"-jar","/spring-boot-docker-app.jar"]