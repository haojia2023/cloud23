package com.glx.springcloud.controllers;

import com.glx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){

        return paymentService.paymentInfo(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentTimeout(@PathVariable("id") Integer id){

               return paymentService.paymentInfo_Timeout(id);
    }

}
