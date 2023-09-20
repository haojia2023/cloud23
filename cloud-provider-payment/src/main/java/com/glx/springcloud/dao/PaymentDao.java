package com.glx.springcloud.dao;

import com.glx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
     int create(Payment payment);

     Payment getPaymentByID(@Param("id") Long id);
}
