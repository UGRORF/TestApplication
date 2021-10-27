package com.example.testapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//
@EnableAutoConfiguration
@Configuration
@ComponentScan
@EnableJpaRepositories
//@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(TestApplication.class, args);
    }

}
