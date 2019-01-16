package com.hope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by SH-YINDAOMING on 2018/12/5.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider2Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }
}
