package com.zhuzihao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppUser {
    public static void main(String[] args) {
        SpringApplication.run(AppUser.class);
        System.out.println("hahhah");
    }
}
