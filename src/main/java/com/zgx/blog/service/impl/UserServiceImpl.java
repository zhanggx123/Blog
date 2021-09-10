package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.UserMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.User;
import com.zgx.blog.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private IUserService userService;

    @Override
    public RespBean getAllUser() {
        List<User> userList = userService.list();
        return RespBean.success("获取成功!",userList);
    }

    @Override
    public RespBean getUserById(Integer id) {
        User user = userService.getById(id);
        return RespBean.success("获取成功!",user);
    }

    @Override
    public RespBean addUser(User user) {
        if(userService.save(user)){
            RespBean.success("添加成功!",user);
        }
        return RespBean.error("添加失败!");
    }

    @Override
    public RespBean moveUser(User user) {
        if(userService.removeById(user)){
            return RespBean.success("移除成功！");
        }
        return RespBean.error("移除失败!",user);
    }
}
