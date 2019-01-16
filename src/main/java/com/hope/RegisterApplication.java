package com.hope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by SH-YINDAOMING on 2018/12/5.
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication.class, args);
    }
}
