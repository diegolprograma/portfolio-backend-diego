FROM amazoncorretto:13-alpine-jdk

COPY target/port-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java" , "-jar" , "/app.jar"]
