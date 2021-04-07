package com.demo.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lx
 * @email 1119878190@qq.com
 * @date 2021-04-02 21:16:52
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

