package com.xzr.webdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xzr.webdemo.dto.Result;
import com.xzr.webdemo.entity.User;
import com.xzr.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserMainController {
    @Autowired
    UserService userService;

    /**
     * To main page
     * @return index.html
     */
    @GetMapping(value = {"/", "/index"})
    public String mainPage() {
        return "index";
    }

    @GetMapping("/gettest")
    @ResponseBody
    public Result testget(@RequestParam("username") String username) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, username);
        User user = userService.getOne(wrapper);
        if (user != null)
            return Result.ok(user);
        else
            return Result.fail("no such user");
    }

    @PostMapping("/posttest")
    @ResponseBody
    public Result testpost(@RequestParam("username") String username) {
        System.out.println(username);
        return Result.ok("user received");
    }
}