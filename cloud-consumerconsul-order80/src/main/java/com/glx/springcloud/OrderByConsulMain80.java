package com.glx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderByConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderByConsulMain80.class,args);
    }
}
