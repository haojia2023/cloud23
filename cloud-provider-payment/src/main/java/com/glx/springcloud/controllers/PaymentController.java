package com.glx.springcloud.controllers;

import com.glx.springcloud.entities.CommonResult;
import com.glx.springcloud.entities.Payment;
import com.glx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@ResponseBody
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String servicePort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("" + result);
        if(result>0)return new CommonResult(200,"success"+servicePort,result);
        else return new CommonResult(444,"fail");
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentByID(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentByID(id);
        log.info("" + payment);
        if(payment!=null)return new CommonResult(200,"success"+servicePort,payment);
        else return new CommonResult(444,"no"+id);
    }
}
