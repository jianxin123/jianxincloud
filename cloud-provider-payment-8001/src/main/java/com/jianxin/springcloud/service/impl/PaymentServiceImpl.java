package com.jianxin.springcloud.service.impl;

import com.jianxin.springcloud.dao.PaymentDao;
import com.jianxin.springcloud.entities.Payment;
import com.jianxin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

//service实现类
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
