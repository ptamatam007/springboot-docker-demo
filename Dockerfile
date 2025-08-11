FROM eclipse-temurin:17

LABEL mentainer="pradeep.tkreddy@gmail.com"

WORKDIR /app

COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar /app/springbootdocker-demo.jar

ENTRYPOINT["java", "-jar", "springbootdocker-demo.jar"]

