package com.zgx.blog.service;

import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    SysUser getUserByUserName(String username);

    /**
     * 用户注册
     */
    public RespBean registerUser(SysUser user);
}
