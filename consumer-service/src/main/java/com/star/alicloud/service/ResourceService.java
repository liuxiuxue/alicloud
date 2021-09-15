package com.star.alicloud.service;

/**
 * @author: liuxiuxue
 * @date: 2021/6/30 10:48
 */

import com.star.alicloud.entity.Resource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "resource-service-provider")
public interface ResourceService {

    @GetMapping("/resource/custom")
    String findCustom();

    @PostMapping("/resource")
    public ResponseEntity<?> saveResource(@RequestBody Resource resource);

    @GetMapping("/resource/page")
    public ResponseEntity<?> findResourcePage(@SpringQueryMap PageQuery query);
}
