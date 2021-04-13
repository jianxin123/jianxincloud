package com.jianxin.springcloud.service;

import com.jianxin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    //从mapper里copy过来的
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
