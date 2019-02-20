package com.example.swaggerready.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello world"));
    }

    @Test
    public void testHelloNiteroi() throws Exception {

        mockMvc.perform(get("/hello").param("niteroi", "true"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello Niteroi"));
    }

    @Test
    public void testGet() throws Exception {

        mockMvc.perform(get("/hello/jane"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello, jane"));
    }
}