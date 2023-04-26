package com.xzr.webdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xzr.webdemo.dto.Result;
import com.xzr.webdemo.entity.Goods;
import com.xzr.webdemo.entity.Order;
import com.xzr.webdemo.entity.User;
import com.xzr.webdemo.service.GoodsService;
import com.xzr.webdemo.service.OrderService;
import com.xzr.webdemo.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    public GoodsService goodsService;
    @Autowired
    public OrderService orderService;

    /**
     * 返回商品列表，这里应该分页的
     *
     * @return Result<List < Goods
     */
    @GetMapping("/itemList")
    public Result getItemList() {
        List<Goods> goodsList = goodsService.list();
        if (goodsList.isEmpty()) {
            return Result.fail("no goods yet");
        }
        return Result.ok(goodsList);
    }

    @PutMapping("/addItem")
    public Result addItem(@RequestBody Goods item) {
        System.out.println(item.getGoodsname());
        goodsService.save(item);
        return Result.ok();
    }

    @PostMapping("/orderList")
    public Result orderList(HttpServletRequest request) {
        LambdaQueryWrapper<Order> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Order::getUserid, request.getSession().getAttribute(request.getHeader("authorization")));
        List<Order> orderList = orderService.list(wrapper);
        if (orderList.isEmpty())
            return Result.fail("no order belongs to you");
        return Result.ok(orderList);
    }
}
