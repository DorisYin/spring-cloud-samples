package com.hope.service;

import com.hope.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SH-YINDAOMING on 2018/12/7.
 */
public interface FeignService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    String hello(@RequestBody User user);
}
