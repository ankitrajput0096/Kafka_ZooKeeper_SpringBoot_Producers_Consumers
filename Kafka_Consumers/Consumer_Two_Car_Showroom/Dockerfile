# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /Kafka_Consumers/Consumer_Two_Car_Showroom
WORKDIR /Kafka_Consumers/Consumer_Two_Car_Showroom/consumer_two_car_showroom

