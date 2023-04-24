package com.xzr.webdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzr.webdemo.dto.Result;
import com.xzr.webdemo.entity.User;
import com.xzr.webdemo.mapper.UserMapper;
import com.xzr.webdemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    // @service加在service和impl上有啥区别吗
    @Override
    public Result getTeachers() {
        return Result.ok(getBaseMapper().getTeachers());
    }
}