package com.star.alicloud.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.star.alicloud.entity.Resource;
import com.star.alicloud.service.PageQuery;
import com.star.alicloud.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author: liuxiuxue
 * @date: 2021/6/28 17:12
 */
@RefreshScope
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Value("${custom.value}")
    private String custom;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/custom")
    public String custom() {
        return custom + serverPort;
    }

    @PostMapping
    public ResponseEntity<?> saveResource(@RequestBody Resource resource){
        boolean result = resourceService.save(resource);
        return new ResponseEntity<Boolean>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findResource(@PathVariable("id") Long id){
        Resource resource = resourceService.getById(id);
        return new ResponseEntity<Resource>(resource, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateResource(@PathVariable("id") Long id, @RequestBody Resource resource){
        boolean result = resourceService.saveOrUpdate(resource);
        return new ResponseEntity<Boolean>(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteResource(@PathVariable("id") Long id){
        boolean result = resourceService.removeById(id);
        return new ResponseEntity<Boolean>(result, HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<?> findResourcePage(PageQuery query){
        Page<Resource> page = resourceService.page(new Page<Resource>(query.getCurrentPage(), query.getSize()));
        return new ResponseEntity<Page<Resource>>(page, HttpStatus.OK);
    }
}

