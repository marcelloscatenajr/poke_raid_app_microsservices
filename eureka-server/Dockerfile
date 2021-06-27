FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar poke-eureka-server.jar
ENTRYPOINT ["java","-jar","/poke-eureka-server.jar"]