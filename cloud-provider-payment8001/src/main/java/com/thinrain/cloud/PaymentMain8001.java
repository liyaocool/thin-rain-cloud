package com.thinrain.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PaymentMain8001
 *
 * @author liyaocool
 * @date 2021/5/20 20:45
 */
@SpringBootApplication
@MapperScan("com.thinrain.cloud.mapper")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
