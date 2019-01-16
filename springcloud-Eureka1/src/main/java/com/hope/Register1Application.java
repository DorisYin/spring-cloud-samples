package com.hope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by SH-YINDAOMING on 2018/12/5.
 */
@SpringBootApplication
@EnableEurekaServer
public class Register1Application {
    public static void main(String[] args) {
        SpringApplication.run(Register1Application.class, args);
    }
}
