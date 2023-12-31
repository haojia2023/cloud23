package com.glx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrix {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix.class,args);
    }
}
