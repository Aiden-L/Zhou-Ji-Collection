package com.xzr.webdemo.bean;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String signature;
    private String type;
    private String email;
    private String university;
    private String field;
    private String birthdate;
}
