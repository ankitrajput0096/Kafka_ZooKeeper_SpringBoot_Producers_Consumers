# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /Kafka_Consumers/Consumer_One_Car_Showroom
WORKDIR /Kafka_Consumers/Consumer_One_Car_Showroom/consumer_one_car_showroom

# building the spring boot app
RUN mvn clean install

# Changing the working directory
WORKDIR /Kafka_Consumers/Consumer_One_Car_Showroom/consumer_one_car_showroom/target

# running the spring boot app
CMD ["java", "-jar", "consumer_one_car_showroom-0.0.1-SNAPSHOT.jar"]

