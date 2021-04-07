package com.demo.gulimail.coupon.dao;

import com.demo.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lx
 * @email 1119878190@qq.com
 * @date 2021-04-02 21:00:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
