package com.xzr.webdemo.controller;


import com.xzr.webdemo.bean.User;
import com.xzr.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
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
    @GetMapping(value = {"/","/index"})
    public String mainPage(){
        return "index";
    }

    @GetMapping("/gettest")
    @ResponseBody
    public String testget(@RequestParam("aaa") String aaa) throws JSONException {
        // 操作数据库
        User a = userService.getUserByUsername(aaa);
        // 返回
        JSONObject ret = new JSONObject();
        ret.put("code","this is get: " + aaa + " received");
        ret.put("name", a.getUsername());
        ret.put("pass", a.getPassword());
        return ret.toString();
    }

    @PostMapping("/posttest")
    @ResponseBody
    public String testpost(@RequestParam("aaa") String aaa) throws JSONException {
        JSONObject ret = new JSONObject();
        ret.put("code","this is post: " + aaa + "received");
        return ret.toString();
    }
}
