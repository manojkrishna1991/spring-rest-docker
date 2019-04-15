# spring-rest-docker Microservice Template 
This is a micro service template build using spring boot

``` bash
# To package and start App
./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar

# To package as a Docker build
./mvnw install dockerfile:build

# To run the docker locally 
docker run -p 8000:8000 -t dmanojkrishna/getstarted

# To run the docker locally with profiles
docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8000:8000 -t springio/gs-spring-boot-docker

# To run the docker with debug port
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8000:8000 -p 5005:5005 -t springio/gs-spring-boot-docker


If you have any questions or suggestions feel free to contact me:

dmanojkrishna@gmail.com
