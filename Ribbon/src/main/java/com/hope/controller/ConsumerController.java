package com.hope.controller;

import com.hope.service.HelloService;
import com.hope.service.HelloServiceCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

/**
 * Created by SH-YINDAOMING on 2018/12/6.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;


    @RequestMapping("/consumer")
    public String helloConsumer() throws ExecutionException, InterruptedException {
        //负载均衡
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        //add hystrix(服务降级)
//        return helloService.helloService();
        HelloServiceCommand command=new HelloServiceCommand("hello",restTemplate);
        String result=command.execute();
        return result;
    }
}
