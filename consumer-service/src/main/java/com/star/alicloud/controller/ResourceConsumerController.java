package com.star.alicloud.controller;

import com.star.alicloud.entity.Resource;
import com.star.alicloud.service.PageQuery;
import com.star.alicloud.service.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author: liuxiuxue
 * @date: 2021/7/2 9:54
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class ResourceConsumerController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/custom")
    public String findResourceCustom(){
        String custom = resourceService.findCustom();
        log.info(custom);
        return custom;
    }

    @PostMapping
    public ResponseEntity<?> saveResource(@RequestBody Resource resource){
        ResponseEntity<?> entity = resourceService.saveResource(resource);
        return new ResponseEntity<Object>(entity.getBody(), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<?> findResourcePage(PageQuery query){
        ResponseEntity<?> entity = resourceService.findResourcePage(query);
        return new ResponseEntity<Object>(entity, HttpStatus.OK);
    }
}
