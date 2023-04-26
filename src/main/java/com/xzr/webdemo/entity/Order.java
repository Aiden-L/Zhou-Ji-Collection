package com.xzr.webdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@TableName("tb_order")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Order {
    @TableId(value = "orderid", type = IdType.ASSIGN_ID) // 雪花算法赋值
    private Long orderId;
    private Integer userid;
    private String order_time;
    private Integer collection_id;
    private String total_price;
    private String state;
    private String address;
    private String delivery;
    private String arrive_time;
    private String comment;
}
