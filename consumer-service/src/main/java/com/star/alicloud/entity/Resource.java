package com.star.alicloud.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: liuxiuxue
 * @date: 2021/7/2 9:57
 */
@Data
public class Resource {
    private Long id;

    private String name;

    private String module;

    private String objectId;

    private Date createTime;

    private boolean enabled = true;
}
