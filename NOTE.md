# Project dependencies 
1. Java (oracle) 17
2. Springboot 3.15
3. Apache Kafka (used 2.13-3.7.0)
*******************
NOTE: For windows, change log files locations in server.properties and zookeeper. properties

Servers Start
1) .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
2) .\bin\windows\kafka-server-start.bat .\config\server.properties

Server Test
3).\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092
4).\bin\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092
5).\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092
6).\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

Topic Creation for Microservice Demo
7).\bin\windows\kafka-console-consumer.bat --topic cab-location --from-beginning --bootstrap-server localhost:9092

Call API (postman) to test 
http://localhost:8082/location
 
