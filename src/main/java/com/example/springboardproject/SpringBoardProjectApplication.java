package com.example.springboardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBoardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoardProjectApplication.class, args);
    }

}
