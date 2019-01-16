package com.hope.controller;

import com.hope.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SH-YINDAOMING on 2018/12/6.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello1";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello(@RequestBody User user) {
        return "hello " + user.getName() + ", " + user.getAge();
    }
}
