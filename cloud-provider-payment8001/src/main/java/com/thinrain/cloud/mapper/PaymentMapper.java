package com.thinrain.cloud.mapper;

import com.thinrain.cloud.entities.Payment;

/**
 * @Entity com.thinrain.cloud.entities.Payment
 */
public interface PaymentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

}




