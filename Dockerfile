
FROM amazoncorretto:17-alpine-jdk
MAINTAINER sofiatarditti
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
