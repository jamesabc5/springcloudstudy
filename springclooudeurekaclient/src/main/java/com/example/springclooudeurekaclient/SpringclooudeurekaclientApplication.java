package com.example.springclooudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringclooudeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclooudeurekaclientApplication.class, args);
    }

}
