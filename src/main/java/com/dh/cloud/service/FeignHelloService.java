package com.dh.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dh on 2018/11/2.
 */
@FeignClient(value = "hello-service",fallback = HelloServiceFallback.class)
public interface FeignHelloService {

    @RequestMapping("hello")
    String hello() ;
}
