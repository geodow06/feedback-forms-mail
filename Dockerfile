FROM maven as build
WORKDIR /build
COPY pom.xml .
RUN mvn verify --fail-never
COPY . .
RUN mvn clean package

FROM openjdk:8
COPY --from=build /build/target/feedback-forms-mail-0.0.1-SNAPSHOT.jar mail.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","mail.jar"]
