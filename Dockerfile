FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
VOLUME /tmp
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package
EXPOSE 8080
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/case_api-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "case_api-0.0.1-SNAPSHOT.jar"]