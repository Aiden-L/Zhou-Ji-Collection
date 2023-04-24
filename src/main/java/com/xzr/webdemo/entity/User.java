package com.xzr.webdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false) // 自动的给model bean实现equals方法和hashcode方法，callSuper：不考虑父类
@Accessors(chain = true)
@TableName("tb_user")
@SuppressWarnings("all")
public class User {
    /**
     * @Data：lombok-加各种注解
     * @EqualsAndHashCode(callSuper = false)：lombok-自动的给model bean实现equals方法和hashcode方法，callSuper：不考虑父类
     * @Accessors(chain=true)：lombok-链式访问，该注解设置chain=true，生成setter方法返回this
     * @TableName("tb_user")：MP-设置表名
     * @SuppressWarnings("all")：取消warning
     */
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