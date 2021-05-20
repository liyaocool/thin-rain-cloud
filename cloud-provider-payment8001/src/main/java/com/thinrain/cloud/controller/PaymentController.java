package com.thinrain.cloud.controller;

import com.thinrain.cloud.entities.CommonResult;
import com.thinrain.cloud.entities.Payment;
import com.thinrain.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * PaymentController
 *
 * @author liyaocool
 * @date 2021/5/20 22:50
 */
@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @GetMapping(value = "/{id}")
    public CommonResult selectByPrimaryKey(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectByPrimaryKey(id);
        return payment != null ?
                new CommonResult(200, "成功", payment)
                : new CommonResult(400, "失败", null);
    }

    @PostMapping(value = "")
    public CommonResult insert(Payment record) {
        int result = paymentService.insert(record);
        log.info("生成订单" + result);
        return result > 0 ?
                new CommonResult(200, "成功", result)
                : new CommonResult(400, "失败", result);
    }
}
