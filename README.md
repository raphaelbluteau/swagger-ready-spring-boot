# Swagger ready Spring Boot application

[![Build Status](https://travis-ci.com/raphaelbluteau/swagger-ready-spring-boot.svg?branch=master)](https://travis-ci.com/raphaelbluteau/swagger-ready-spring-boot)
[![Coverage Status](https://coveralls.io/repos/github/raphaelbluteau/swagger-ready-spring-boot/badge.svg?branch=master)](https://coveralls.io/github/raphaelbluteau/swagger-ready-spring-boot?branch=master)
[![BCH compliance](https://bettercodehub.com/edge/badge/raphaelbluteau/swagger-ready-spring-boot?branch=master)](https://bettercodehub.com/)

This sample project uses [springfox](https://github.com/springfox/springfox) to document a simple API.

Take a look at [this tutorial](https://raphaelcarvalho.dev/2019/03/14/spring-boot-swagger-documentando-sua-api-automaticamente/) that I wrote using this project, feel free to reach me.

## Running the application

You can run the application using Gradle wrapper:

```
./gradlew bootRun
```

Or using Maven:

```
./mvnw clean spring-boot:run
```

After building and running the application, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
``` 
