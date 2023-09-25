package com.glx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentHystrix {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix.class,args);
    }
}
