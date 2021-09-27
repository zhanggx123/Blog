package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.UserAttentionMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserAttention;
import com.zgx.blog.service.IUserAttentionService;
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
public class UserAttentionServiceImpl extends ServiceImpl<UserAttentionMapper, UserAttention> implements IUserAttentionService {

    @Autowired
    private IUserAttentionService userAttentionService;


    @Override
    public RespBean addUserAttention(UserAttention userAttention) {
        if(userAttentionService.save(userAttention))
            return RespBean.success("关注成功!");
        return RespBean.error("关注失败!");
    }

    @Override
    public RespBean delUserAttention(UserAttention userAttention) {
        if(userAttentionService.removeById(userAttention)){
            return RespBean.success("取消关注成功！");
        }
        return RespBean.error("取消关注失败!");
    }

    @Override
    public List<UserAttention> showUserAttention(UserAttention userAttention) {

        return null;
    }
}
