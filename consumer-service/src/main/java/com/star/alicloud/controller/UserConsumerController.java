package com.star.alicloud.controller;

import com.star.aicloud.entity.User;
import com.star.alicloud.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: liuxiuxue
 * @date: 2021/7/5 14:40
 */
@RestController
@RequestMapping("/user")
public class UserConsumerController {

    @Resource
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        ResponseEntity<?> save = userService.saveUser(user);
        return new ResponseEntity<Object>(save, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> save(@PathVariable Long id){
        ResponseEntity<?> user = userService.findUser(id);
        return new ResponseEntity<Object>(user, HttpStatus.OK);
    }
}
