package com.hope.controller;

import com.hope.User;
import com.hope.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SH-YINDAOMING on 2018/12/7.
 */
public class ConsumerController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/consumer")
    public String helloConsumer() {
        return feignService.hello();
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2() {
        String r1 = feignService.hello("hjc");
        String r2 = feignService.hello("hjc", 23).toString();
        String r3 = feignService.hello(new User("hjc", 22));
        return r1 + "---" + r2 + "---" + r3;
    }
}
