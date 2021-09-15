package com.star.alicloud.service;

/**
 * @author: liuxiuxue
 * @date: 2021/6/30 10:48
 */

import com.star.aicloud.entity.User;
import com.star.alicloud.entity.Resource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "auth-service-provider")
public interface UserService {


    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user);

    @GetMapping("/user/{id}")
    public ResponseEntity<?> findUser(@PathVariable("id") Long id);
}
