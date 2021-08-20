package com.zgx.blog.controller;

import com.zgx.blog.pojo.AdminLoginParam;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.SysUser;
import com.zgx.blog.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
@Api(tags = "LoginController")
public class LoginController {

    @Autowired
    private ISysUserService userService;

    @ApiOperation(value = "登陆之后返回token")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return userService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value = "获取当前登录用户的信息")
    @GetMapping("/admin/info")
    public SysUser getUserinfo(Principal principal){
        if(null==principal){
            return null;
        }
        String username=principal.getName();
        SysUser sysUser= userService.getUserByUserName(username);
        sysUser.setPassword(null);
        return sysUser;
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("logout")
    public RespBean logout(){
        return RespBean.success("注销成功");
    }

}
