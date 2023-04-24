package com.xzr.webdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xzr.webdemo.dto.Result;
import com.xzr.webdemo.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    Result getTeachers(); // 这里的Result和mapper中的List<User>并不冲突
}