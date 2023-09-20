package com.glx.springcloud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    private String INVOKE_URE="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URE+"/payment/zk",String.class);
    }
}
