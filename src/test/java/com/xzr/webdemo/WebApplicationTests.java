package com.xzr.webdemo;

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
        //Long a = jdbcTemplate.queryForObject("select count(*) from user",Long.class);
        //System.out.println("记录"+a);
        System.out.println(userService.getUserByUsername("aiden"));
    }

}
