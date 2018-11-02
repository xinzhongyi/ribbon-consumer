package com.dh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

////注册为Eurake客户端应用，获取服务发现能力
@EnableDiscoveryClient
////开启断路器功能
//@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class RibbonConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}


	//创建RestTemplate实例，并开启客户端负载均衡
//	@Bean
//	@LoadBalanced
//	RestTemplate restTemplate(){
//		return new RestTemplate() ;
//	}
}
