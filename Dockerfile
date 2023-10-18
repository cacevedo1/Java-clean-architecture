FROM adoptopenjdk/openjdk11-openj9:alpine-slim
VOLUME /tmp
EXPOSE 8080
ADD ./applications/app-service/build/libs/crudTest.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]



