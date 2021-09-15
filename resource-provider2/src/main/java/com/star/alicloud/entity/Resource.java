package com.star.alicloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author: liuxiuxue
 * @date: 2021/6/30 13:49
 */
@Data
public class Resource {

    @TableId(type=IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private String module;

    private String objectId;

    private Date createTime;

    private boolean enabled = true;
}
