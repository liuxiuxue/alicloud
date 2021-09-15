package com.star.alicloud.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.star.aicloud.entity.User;
import com.star.alicloud.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author: liuxiuxue
 * @date: 2021/7/5 14:29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
