package com.xuzhi.spring.cloud.alibaba.consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsumerConfiuration {

    /**
     * @LoadBalanced 注解，说明这个 bean 具有负载均衡功能
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate  restTemplate(){
        return new RestTemplate();
    }
}
