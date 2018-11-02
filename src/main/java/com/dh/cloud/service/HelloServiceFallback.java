package com.dh.cloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by dh on 2018/11/2.
 */
@Component
public class HelloServiceFallback implements FeignHelloService {

    @Override
    public String hello() {
        return "feign hystrix fallback";
    }
}
