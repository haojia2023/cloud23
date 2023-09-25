package com.glx.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo(Integer id){
        return  Thread.currentThread().getName()+""+id;
    }
    public String paymentInfo_Timeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  Thread.currentThread().getName()+"3sec"+id;
    }
}
