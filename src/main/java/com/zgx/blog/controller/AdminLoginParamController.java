package com.zgx.blog.controller;

import com.zgx.blog.pojo.AdminParam;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IAdminParamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userLogin")
public class AdminLoginParamController {

    @Autowired
    private IAdminParamService adminParamService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public RespBean userLogin(@RequestBody AdminParam adminParam){
       return adminParamService.login(adminParam);
    }

}
