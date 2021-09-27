package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserAttention;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IUserAttentionService extends IService<UserAttention> {


    /**
     * 关注用户
     */
    RespBean addUserAttention(UserAttention userAttention);

    /**
     * 取消关注用户
     */
    RespBean delUserAttention(UserAttention userAttention);

    /**
     * 展示用户关注列表
     */
    List<UserAttention> showUserAttention(UserAttention userAttention);



}
