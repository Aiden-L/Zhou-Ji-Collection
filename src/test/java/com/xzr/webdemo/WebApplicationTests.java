package com.xzr.webdemo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xzr.webdemo.entity.User;
import com.xzr.webdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class WebApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, "aiden");
        User user = userService.getOne(wrapper);
        if (user != null)
            System.out.println("no such user");
        else
            System.out.println("ok");
    }
}
