package com.thinrain.cloud.service;

import com.thinrain.cloud.entities.Payment;

/**
 * PaymentService
 *
 * @author liyaocool
 * @date 2021/5/20 22:39
 */
public interface PaymentService {
    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}
