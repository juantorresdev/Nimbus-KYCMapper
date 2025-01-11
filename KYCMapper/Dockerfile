FROM openjdk:21-jdk-slim AS kycmapperservice
EXPOSE 9090
ARG JAR_FILE=KYCMapper/target/KYCMapper-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} DB-Connector.jar
ENTRYPOINT ["java","-jar","/KYCMapper-0.0.1-SNAPSHOT.jar"]

#WORKDIR /
#COPY DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar build/
#WORKDIR DB-Connector/target/
#ENTRYPOINT ["java","-jar","/DB-Connector/target/DB-Connector-0.0.1-SNAPSHOT.jar"]