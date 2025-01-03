# Kafka_ZooKeeper_SpringBoot_Producers_Consumers

This project sets up a Dockerized Apache Kafka cluster with three Kafka servers monitored by a three-node Zookeeper ensemble, ensuring high availability and fault tolerance. It also includes three Spring Boot-based producer and consumer applications, demonstrating seamless integration and message processing within the Kafka ecosystem.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes. See running for notes on how to run the project on a system.

### Prerequisites

1. Clone the project to your local environment:
    ```
    git clone https://github.com/ankitrajput0096/Kafka_ZooKeeper_SpringBoot_Producers_Consumers
    ```

2. You need Docker to be installed:

    #### Windows:
    https://download.docker.com/win/stable/Docker%20for%20Windows%20Installer.exe
    
    #### Mac:
    https://download.docker.com/mac/stable/Docker.dmg
    
    #### Ubuntu:
    https://docs.docker.com/install/linux/docker-ce/ubuntu/

## Installing and Running

To build and start the kafka cluster along with spring-boot producers and consumers, enter these two commands
```
docker-compose build
```
```
docker-compose up
```
## Get an access to all exposed API's with Postman for creating event by spring-boot producers

1. Install Postman (https://www.getpostman.com)
2. Import Postman collection from the `SpringBoot_Kafka_ZooKeeper_Producer_Consumer.postman_collection.json` file
3. Enjoy !!

#### NOTE : To see kafka cluster in action, observe terminal logs appropriately.

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot 2
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - For containerization of application
* [Kafka](https://kafka.apache.org/) - For Kafka servers
* [ZooKeeper](https://zookeeper.apache.org/) - For ZooKeeper servers

## Contributing

If you have any improvement suggestions please create a pull request and I'll review it.


## Authors

* **Ankit Rajput** - *Initial work* - [Github](https://github.com/ankitrajput0096)

## License

This project is licensed under the MIT License




