package com.demo.gulimail.member.dao;

import com.demo.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lx
 * @email 1119878190@qq.com
 * @date 2021-04-02 21:07:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
