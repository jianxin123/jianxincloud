package com.jianxin.springcloud.controller;

import com.jianxin.springcloud.entities.CommonResult;
import com.jianxin.springcloud.entities.Payment;
import com.jianxin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    //对数据库是插入操作 用post
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果：" + result);

        if(result > 0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
//        return new CommonResult(200,"3ewrwere");
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+ payment);

        if(payment != null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"查询ID" +id+ "失败",null);
        }

    }
}
