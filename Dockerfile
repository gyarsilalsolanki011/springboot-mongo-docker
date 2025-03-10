FROM maven as build
WORKDIR /app
COPY . .
RUN mvn install

FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/springboot-mongo-docker.jar /app/app.jar
EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "app.jar"]