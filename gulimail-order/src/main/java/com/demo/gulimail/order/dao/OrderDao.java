package com.demo.gulimail.order.dao;

import com.demo.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lx
 * @email 1119878190@qq.com
 * @date 2021-04-02 21:16:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
