package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zgx.blog.mapper.AdminParamMapper;

import com.zgx.blog.pojo.AdminParam;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IAdminParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminParamServiceImpl extends ServiceImpl<AdminParamMapper, AdminParam> implements IAdminParamService {

    @Autowired
    private AdminParamMapper adminParamMapper;

    @Override
    public RespBean login(AdminParam adminParam) {

        AdminParam loginAdmin = adminParamMapper.login(adminParam);
    //    AdminParam loginAdmin = adminParamMapper.selectOne(new QueryWrapper<user>().eq("username", adminParam.getUsername()).eq("password", adminParam.getPassword()));
        System.out.println(loginAdmin);
        if(loginAdmin!=null)
            return RespBean.success("登录成功!",loginAdmin.getUsername());
        return RespBean.error("用户名或密码错误！");
    }
}
