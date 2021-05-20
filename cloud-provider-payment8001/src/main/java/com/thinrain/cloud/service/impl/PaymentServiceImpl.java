package com.thinrain.cloud.service.impl;

import com.thinrain.cloud.entities.Payment;
import com.thinrain.cloud.mapper.PaymentMapper;
import com.thinrain.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * PaymentServiceImpl
 *
 * @author liyaocool
 * @date 2021/5/20 22:41
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentMapper paymentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return paymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Payment record) {
        return paymentMapper.insert(record);
    }

    @Override
    public int insertSelective(Payment record) {
        return paymentMapper.insertSelective(record);
    }

    @Override
    public Payment selectByPrimaryKey(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Payment record) {
        return paymentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Payment record) {
        return paymentMapper.updateByPrimaryKey(record);
    }
}
