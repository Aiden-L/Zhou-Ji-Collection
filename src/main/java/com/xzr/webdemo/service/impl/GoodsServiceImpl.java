package com.xzr.webdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzr.webdemo.entity.Goods;
import com.xzr.webdemo.mapper.GoodsMapper;
import com.xzr.webdemo.service.GoodsService;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
}
