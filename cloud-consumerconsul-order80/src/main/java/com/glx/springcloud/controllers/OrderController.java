package com.glx.springcloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    private String INVOKE_URE = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URE + "/payment/consul", String.class);
    }
}
