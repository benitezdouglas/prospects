#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY ./ /home/app
RUN mvn clean package

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /home/app/target/prospect-0.0.1-SNAPSHOT.jar /usr/local/lib/prospect.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/prospect.jar"]