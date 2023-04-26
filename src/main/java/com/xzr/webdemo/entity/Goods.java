package com.xzr.webdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false) // 自动的给model bean实现equals方法和hashcode方法，callSuper：不考虑父类
@Accessors(chain = true)
@TableName("tb_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goodsid", type = IdType.AUTO) // MP注解：这个字段在表中是goodsid，数据库自增赋值
    private Integer goodsid; // https://blog.csdn.net/weixin_45797022/article/details/121042485

    private String goodsname;
    private String type;
    private String area;
    private String price;
    private String history;
    private int storage;
    private String goodsinfo;
    private String cover;
    private String shopname;
    private String praise;
    private String trample;
}
