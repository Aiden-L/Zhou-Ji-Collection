package com.xzr.webdemo.mapper;

import com.xzr.webdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public User getUser(String username);
    public List<User> getTeachers();
    public void updateUser(User user);
    public void updatePass(User user);
    public void createUser(String username, String password, String type, String email, String university, String field);
}
