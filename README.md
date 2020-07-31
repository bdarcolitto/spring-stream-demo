Projeto Spring Cloud Stream com integração via Kafka utilizando Apache avro como schema registry.

## Configurando o Kafka local

Vamos utilizar o docker para subir o ecossistema do Kafka para facilitar em muito sua configuração local.

#### Pull do repo Kafka Confluente

```sh
git clone https://github.com/confluentinc/cp-all-in-one
cd cp-all-in-one
git checkout 5.5.1-post
cd cp-all-in-one/
```
#### Subindo os containers Kafka com Docker compose

```sh
docker-compose up -d
```

Verifique quando todos os containers estiverem de pé e rodando. Caso algum esteja como `Exit` rode o comando acima novamente. Isso pode acontecer a depender dos recursos disponíveis em sua máquina, pois há containers que depende que outros estejam de pé e que podem ainda não ter sido iniciados.
Todos os containers devem estar no estado `UP`.

**Referência**: https://docs.confluent.io/current/quickstart/ce-docker-quickstart.html

### Kafka Control Center

Após os containers iniciados, podemos acessar o gerenciador visual em `http://localhost:9021`.

- Entre no `Cluster 1`
- Vá ao menu `Topics`
- Clique no botão `add a topic`
- Coloque o nome do seu tópico (para esse projeto use o nome `city-details`)
- Em `number of partitions`, coloque acima de 1 para que depois possa ser feito testes para entendimento desse funcionamento entre produtor e consumidor
- Em `customize settings` há vários outros parâmetros que não serão abordados agora

Agora você está com o Kafka local e com o tópico criado!

### Start da aplicação

Basta usar `./gradlew bootRun`, em java 11

#### Endpoint para teste

`POST http://localhost:8080/kafka/register` em text/html.

Você verá o log (exemplo):

```
Sending message id = 325058649 and name = Araraquara
Partition (0) - Key[325058649] - Receiving message id = 325058649 and name = Araraquara
```
