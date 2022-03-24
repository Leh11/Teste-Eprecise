## Funcionalidade desenvolvidas
### Cidade
- [Ok] - Get com paginação; End-point "http://localhost:8080/api/state/findStateByPage"
- [Ok] - Post; End-point "http://localhost:8080/api/state"
- [Ok] - Put; End-point "http://localhost:8080/api/state/update?id=11"
- [Ok] - Delete; End-point "http://localhost:8080/api/state/deleteState?id=17"
- [Ok] - Get numero de registro; End-point "http://localhost:8080/api/state/amountState
- [ ] - Get cidade pelo nome / incompleta; End-point "http://localhost:8080/api/city/findCityByName?name=Limoeiro"

### Estado
- [Ok] - Get com paginação; End-point "http://localhost:8080/api/city/findCityByPage"
- [Ok] - Get numero de registro; End-point "http://localhost:8080/api/city/amountCity"
- [Ok] - Post; End-point "hhttp://localhost:8080/api/city"
- [Ok] - Put; End-point "http://localhost:8080/api/city/update?id=28"
- [Ok] - Delete; End-point "http://localhost:8080/api/city/deleteCity?id=18"

## Dificuldades
- Customização de PanacheQuery para recuperação de cidades a partir de 3 characters;
- Customização de PanacheQuery para recuperação de cidades pelo nome do estado;


# eprecise-teste Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory. Be aware that it’s not an _über-jar_ as
the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/eprecise-teste-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
