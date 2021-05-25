package com.thinrain.cloud.controller;

import com.thinrain.cloud.entities.CommonResult;
import com.thinrain.cloud.entities.Payment;
import com.thinrain.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/{id}")
    public CommonResult selectByPrimaryKey(@PathVariable("id") Long id) {
        try {
            Payment payment = paymentService.selectByPrimaryKey(id);
            return payment != null ?
                    new CommonResult(200, "查询成功" + serverPort, payment)
                    : new CommonResult(400, "查询订单失败" + serverPort, null);
        } catch (Exception e) {
            log.error("系统错误:" + e);
            return new CommonResult(500, "系统错误" + serverPort, null);
        }

    }

    @PostMapping(value = "")
    public CommonResult insert(@RequestBody Payment payment) {
        try {
            log.info("payment", payment.toString());
            int result = paymentService.insert(payment);

            if (result > 0) {
                return new CommonResult(200, "成功", result);
            } else {
                log.error("生成订单错误" + result);
                return new CommonResult(400, "失败", null);
            }
        } catch (Exception e) {
            log.error("生成订单错误" + e);
            return new CommonResult(500, "系统错误", null);
        }

    }
}
