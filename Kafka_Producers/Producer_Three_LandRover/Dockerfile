# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /Kafka_Producers/Producer_Three_LandRover
WORKDIR /Kafka_Producers/Producer_Three_LandRover/producer_three_land_rover

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /Kafka_Producers/Producer_Three_LandRover/producer_three_land_rover/target

# running the spring boot app
CMD ["java", "-jar", "producer_three_land_rover-0.0.1-SNAPSHOT.jar"]

