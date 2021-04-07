package com.demo.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.gulimail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lx
 * @email 1119878190@qq.com
 * @date 2021-04-02 10:02:53
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

