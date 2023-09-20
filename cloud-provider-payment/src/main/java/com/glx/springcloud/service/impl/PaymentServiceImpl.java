package com.glx.springcloud.service.impl;

import com.glx.springcloud.dao.PaymentDao;
import com.glx.springcloud.entities.Payment;
import com.glx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentByID(Long id){
        return paymentDao.getPaymentByID(id);
    }
}
