package com.eureka.member.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringEurekaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaMemberApplication.class, args);
    }

}
