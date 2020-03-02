package com.sen.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//开启负载均衡 调用地址可使用服务名(spring.application.name)
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
