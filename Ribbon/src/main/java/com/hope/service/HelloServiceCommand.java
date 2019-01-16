package com.hope.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SH-YINDAOMING on 2018/12/7.
 */
public class HelloServiceCommand extends HystrixCommand<String> {
    private RestTemplate restTemplate;

//    protected HelloServiceCommand(HystrixCommandGroupKey group) {
//        super(group);
//    }

    public HelloServiceCommand(String commandGroupKey, RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
    }

    //服务调用
    @Override
    protected String run() throws Exception {
        System.out.println("threadName:"+Thread.currentThread().getName());
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    //服务降级时所调用的fallback()
    @Override
    protected String getFallback() {
        return "error111";
    }
}
