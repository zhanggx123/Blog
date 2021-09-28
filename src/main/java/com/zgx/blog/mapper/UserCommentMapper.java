package com.zgx.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserComment;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface UserCommentMapper extends BaseMapper<UserComment> {

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
