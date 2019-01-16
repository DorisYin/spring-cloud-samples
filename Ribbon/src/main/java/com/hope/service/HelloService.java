package com.hope.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

/**
 * Created by SH-YINDAOMING on 2018/12/6.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    //请求熔断注解，当服务出现问题时候会执行fallbackMethod属性的名为helloFallBack的方法
    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() throws ExecutionException, InterruptedException {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    public String helloFallBack() {
        return "error";
    }
}
