package com.glx.springcloud.controllers;

import com.glx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/hystrix/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        return paymentService.paymentInfo(id);
    }

    @GetMapping("/consumer/hystrix/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id){
        return paymentService.paymentTimeout(id);
    }
}
