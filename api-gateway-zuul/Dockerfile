FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/api-gateway-zuul-0.0.1-SNAPSHOT.jar poke-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/poke-api-gateway-zuul.jar"]