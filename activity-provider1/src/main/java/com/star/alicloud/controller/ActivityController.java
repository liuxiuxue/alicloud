package com.star.alicloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuxiuxue
 * @date: 2021/7/2 16:55
 */
@RefreshScope
@RestController
@RequestMapping("/resource")
public class ActivityController {

    @Value("${custom.value}")
    private String custom;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/custom")
    public String custom() {
        return custom + serverPort;
    }
}
