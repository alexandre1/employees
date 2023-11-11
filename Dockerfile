FROM eclipse-temurin:18.0.1_10-jre
COPY target/*.jar my-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/my-app-0.0.1-SNAPSHOT.jar"]
RUN mkdir -p /docker-entrypoint-initdb.d/
