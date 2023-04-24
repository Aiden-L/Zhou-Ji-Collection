package com.xzr.webdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzr.webdemo.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> getTeachers();
}
