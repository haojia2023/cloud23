package com.glx.springcloud.service;

import com.glx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentByID(@Param("id") Long id);
}
