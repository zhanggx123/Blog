package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserComment;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IUserCommentService extends IService<UserComment> {

    /**
     * 新增评论
     */
    RespBean addComment(UserComment userComment);

    /**
     * 删除评论
     */
    RespBean delComment(UserComment userComment);

    /**
     * 展示评论
     */
    List<UserComment> showComment();

}
