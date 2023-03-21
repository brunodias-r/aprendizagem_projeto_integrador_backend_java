FROM maven:3.9.0-ibm-semeru-11-focal as build
COPY src /usr/src/app/src  
ADD pom.xml /usr/src/app
ADD mvnw /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip=true

FROM openjdk:18-ea-11-jdk-alpine3.15
COPY --from=build /usr/src/app/target/api-0.0.1-SNAPSHOT.jar /usr/app/api-0.0.1-SNAPSHOT.jar 
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/usr/app/api-0.0.1-SNAPSHOT.jar"]