Links
release do app front-end: https://github.com/Tabacow/projeto-de-flutter-Aplicativos-Hibridos/releases/tag/1 <br />
repositório do config-server: https://github.com/marcelloscatenajr/poke_raid_app_config_server <br />
vídeo mostrando o projeto: https://www.youtube.com/watch?v=Q9s_P-Bj3xk <br />

Criação e alimentação dos bancos de dados:

```
CREATE DATABASE pokemon;
create table pokemon (number int4 not null, name varchar(255), type1 varchar(255), type2 varchar(255), primary key (number));
insert into pokemon values (483, 'Dialga', 'Steel', 'Dragon');
insert into pokemon values (484, 'Palkia', 'Water', 'Dragon');
insert into pokemon values (485, 'Heatran', 'Fire', 'Steel');
insert into pokemon values (486, 'Regigigas', 'Normal', 'None');
insert into pokemon values (487, 'Giratina', 'Ghost', 'Dragon');

CREATE DATABASE raid;
create table raid (id int8 generated by default as identity, guestfc1 int8, guestfc2 int8, guestfc3 int8, hostfc int8, pokemon_number int4, primary key (id));
```

Para rodar os bancos de dados no docker:
```
docker network create poke-net
docker pull postgres:12-alpine
docker run -p 5432:5432 --name pokemon-pg12 --network poke-net -e POSTGRES_PASSWORD=ma101098 -e POSTGRES_DB=pokemon postgres:12-alpine
docker run -p 5433:5432 --name raid-pg12 --network poke-net -e POSTGRES_PASSWORD=ma101098 -e POSTGRES_DB=raid postgres:12-alpine
```

Comandos usados para subir os microsserviços no docker: (Funcionamento parcial)
```
cd config-server
docker build -t poke-config-server:v1 .
docker run -p 8888:8888 --name poke-config-server --network poke-net poke-config-server:v1

cd ../eureka-server
docker build -t poke-eureka-server:v1 .
docker run -p 8761:8761 --name poke-eureka-server --network poke-net poke-eureka-server:v1

cd ../pokemon
docker build -t poke-pokemon:v1 .
docker run -P --network poke-net poke-pokemon:v1

cd ../raid
docker build -t poke-raid:v1 .
docker run -P --network poke-net poke-raid:v1

cd ../api-gateway-zuul
docker build -t poke-api-gateway-zuul:v1 .
docker run -p 8765:8765 --name poke-api-gateway-zuul --network poke-net poke-api-gateway-zuul:v1

```
