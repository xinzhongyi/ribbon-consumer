package com.dh.cloud.api;

import com.dh.cloud.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

/**
 * Created by dh on 2018/11/2.
 */
@RestController
public class FeignConsumerController {

    @Autowired
    FeignHelloService feignHelloService;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return feignHelloService.hello() ;
    }
}
