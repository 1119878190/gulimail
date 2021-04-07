package com.demo.gulimail.product;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.demo.gulimail.product.entity.BrandEntity;
import com.demo.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() throws FileNotFoundException {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("sdfsd");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

       /* List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });*/

    }

    @Test
    public void testUpload() throws FileNotFoundException {

    }

}
