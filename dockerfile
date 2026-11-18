FROM amazoncorretto:17
WORKDIR /app
COPY build/libs/app.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]