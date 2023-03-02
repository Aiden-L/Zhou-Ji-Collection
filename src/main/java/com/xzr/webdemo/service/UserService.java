package com.xzr.webdemo.service;

import com.xzr.webdemo.bean.User;
import com.xzr.webdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 根据用户名得到用户信息 Get user by username
     * @param username String 用户名
     * @return com.xzr.yespaper.bean.User;
     */
    public User getUserByUsername(String username){
        return userMapper.getUser(username);
    }

    /**
     * 返回老师列表 Get reviewers
     * @return List<User> com.xzr.yespaper.bean.User;
     */
    public List<User> getTeachers(){
        return userMapper.getTeachers();
    }

    /**
     * 修改个人信息 Update user information
     * @param user com.xzr.yespaper.bean.User
     */
    public boolean updateUserInfo(User user){
        try{
            userMapper.updateUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 修改密码 Update password
     * @param user com.xzr.yespaper.bean.User
     */
    public boolean updatePassword(User user){
        try{
            userMapper.updatePass(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 创建用户 Create user
     * @param username String 用户名
     * @param password String 密码
     * @param type String 用户类型
     * @param email String 邮箱
     * @param university String 学校
     * @return Boolean true/false 成功或失败
     */
    public Boolean createUserAccount(String username, String password, String type, String email, String university, String field){
        try{
            userMapper.createUser(username, password, type, email, university, field);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
