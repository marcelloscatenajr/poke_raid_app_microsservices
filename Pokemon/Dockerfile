FROM openjdk:11
VOLUME /tmp
ADD ./target/Pokemon-0.0.1-SNAPSHOT.jar poke-pokemon.jar
ENTRYPOINT ["java","-jar","/poke-pokemon.jar"]