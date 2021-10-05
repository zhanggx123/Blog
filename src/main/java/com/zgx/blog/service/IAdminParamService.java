package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zgx.blog.pojo.AdminParam;
import com.zgx.blog.pojo.RespBean;
import org.apache.ibatis.annotations.Mapper;

public interface IAdminParamService extends IService<AdminParam> {

    /**
     * 用户登录
     */
    RespBean login(AdminParam adminParam);
}
