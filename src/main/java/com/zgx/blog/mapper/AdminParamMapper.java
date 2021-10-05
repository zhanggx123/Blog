package com.zgx.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.zgx.blog.pojo.AdminParam;
import org.apache.ibatis.annotations.Param;

public interface AdminParamMapper extends BaseMapper<AdminParam> {

    AdminParam login(@Param("adminParam") AdminParam adminParam);

}
