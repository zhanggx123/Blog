package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.User;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IUserService extends IService<User> {

    /**
     * 获取all用户信息
     */
    public RespBean getAllUser();

    /**
     * 获取用户信息
     */
    RespBean getUserById(Integer id);

    /**
     * 添加用户
     */
    RespBean addUser(User user);

    /**
     * 移除用户
     */
    RespBean moveUser(User user);


}
