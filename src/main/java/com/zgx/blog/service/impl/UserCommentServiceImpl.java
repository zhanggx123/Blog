package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.UserCommentMapper;
import com.zgx.blog.pojo.UserComment;
import com.zgx.blog.service.IUserCommentService;
import org.springframework.stereotype.Service;

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

}
