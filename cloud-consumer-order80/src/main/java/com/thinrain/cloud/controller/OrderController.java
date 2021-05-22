package com.thinrain.cloud.controller;

import com.thinrain.cloud.entities.CommonResult;
import com.thinrain.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author liyaocool
 * @date 2021/5/21 22:50
 */
@RestController
@Slf4j
@RequestMapping(value = "/consumer")
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        log.info("order payment",payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, CommonResult.class);
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
    }
}
