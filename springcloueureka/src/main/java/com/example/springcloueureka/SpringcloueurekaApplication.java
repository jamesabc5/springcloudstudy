package com.example.springcloueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloueurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloueurekaApplication.class, args);
    }

}
