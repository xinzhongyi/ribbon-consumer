package com.dh.cloud.api;

import com.dh.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dh on 2018/11/1.
 */
@RestController
public class ConsumerController {

//    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService ;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody() ;
    }

    @RequestMapping(value = "/ribbon-consumer-hystrix",method = RequestMethod.GET)
    public String helloConsumerHystrix(){
        return helloService.helloService() ;
    }
}
