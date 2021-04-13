package com.jianxin.springcloud.dao;

import com.jianxin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int create(Payment payment);

    //@Param作为Dao层的注解，作用是用于传递参数，从而可以与SQL中的的字段名相对应。用来指定当前参数对应的在XML中的参数位置。
    Payment getPaymentById(@Param("id") Long id);


}
