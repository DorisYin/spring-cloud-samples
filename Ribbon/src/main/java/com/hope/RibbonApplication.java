package com.hope;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SH-YINDAOMING on 2018/12/6.
 */
@SpringBootApplication
@EnableDiscoveryClient
//允许断路器
@EnableCircuitBreaker
@EnableHystrixDashboard
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
