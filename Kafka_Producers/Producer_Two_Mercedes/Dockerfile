# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /Kafka_Producers/Producer_Two_Mercedes
WORKDIR /Kafka_Producers/Producer_Two_Mercedes/producer_two_mercedes

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /Kafka_Producers/Producer_Two_Mercedes/producer_two_mercedes/target

# running the spring boot app
CMD ["java", "-jar", "producer_two_mercedes-0.0.1-SNAPSHOT.jar"]

