#
# Build stage
#
FROM maven:3.6.0-jdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17-jre-slim
COPY --from=build /home/app/target/prospect-0.0.1-SNAPSHOT.jar /usr/local/lib/prospect.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/prospect.jar"]