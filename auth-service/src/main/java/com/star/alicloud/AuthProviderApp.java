package com.star.alicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: liuxiuxue
 * @date: 2021/7/5 14:28
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthProviderApp.class, args);
    }
}
