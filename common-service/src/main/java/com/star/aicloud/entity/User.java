package com.star.aicloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author: liuxiuxue
 * @date: 2021/7/5 14:14
 */
@Data
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private String phone;

    private String email;

    private Date createTime;

    private boolean enabled = true;
}
