package com.zgx.blog.controller;

import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.SysUser;
import com.zgx.blog.service.ISysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RegisterController {

    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation(value = "用户注册")
    @PostMapping("register")
    public RespBean registerUser(@RequestBody SysUser user){
        return sysUserService.registerUser(user);
    }

}
