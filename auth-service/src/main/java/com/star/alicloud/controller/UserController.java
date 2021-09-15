package com.star.alicloud.controller;

import com.star.aicloud.entity.User;
import com.star.alicloud.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: liuxiuxue
 * @date: 2021/7/5 14:31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        boolean save = userService.save(user);
        return new ResponseEntity<Boolean>(save, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> save(@PathVariable Long id){
        User user = userService.getById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
