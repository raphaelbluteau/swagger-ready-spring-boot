package com.example.swaggerready.http;

import com.example.swaggerready.http.response.Greeting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Greeting")
public class GreetingController {

  @ApiOperation(value = "Greets the world or Niteroi")
  @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public Greeting hello(@RequestParam(required = false) boolean niteroi) {

    Greeting greeting = new Greeting("Hello world");

    if (niteroi) {
      greeting.setMessage(greeting.getMessage().replace("world", "Niteroi"));
    }

    return greeting;
  }

  @ApiOperation(value = "Greets a person given her name")
  @GetMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public Greeting get(@PathVariable String name) {

    return new Greeting("Hello, " + name);
  }
}
