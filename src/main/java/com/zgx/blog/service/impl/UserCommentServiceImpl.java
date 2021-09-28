package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.UserCommentMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserComment;
import com.zgx.blog.service.IUserCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
@Service
public class UserCommentServiceImpl extends ServiceImpl<UserCommentMapper, UserComment> implements IUserCommentService {

    @Autowired
    private IUserCommentService userCommentService;

    @Override
    public RespBean addComment(UserComment userComment) {
        if(userCommentService.save(userComment)){
            return RespBean.success("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @Override
    public RespBean delComment(UserComment userComment) {
        if(userCommentService.removeById(userComment)){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @Override
    public List<UserComment> showComment() {
        return userCommentService.list();
    }
}
