package com.xzr.webdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzr.webdemo.entity.Order;
import com.xzr.webdemo.mapper.OrderMapper;
import com.xzr.webdemo.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
