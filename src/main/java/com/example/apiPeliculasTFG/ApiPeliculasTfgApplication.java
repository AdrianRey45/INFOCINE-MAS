package com.example.apiPeliculasTFG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApiPeliculasTfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPeliculasTfgApplication.class, args);
    }

}