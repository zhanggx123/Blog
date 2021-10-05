package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.UserMapper;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.User;
import com.zgx.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        //设置默认值
        user.setGroup_id(1);  //用户组
        user.setUser_mark(0); //用户积分
        user.setUser_rank_id(1); //用户等级
        user.setUser_last_login_ip("192.168.1.1");
        if(user.getUser_description().equals("")){
            user.setUser_description("这个人很懒，懒得描述自己！");
        }
        user.setUser_register_ip("192.168.1.2");
        if(user.getUser_says().equals("")){
            user.setUser_says("好好学习，天天向上");
        }

        user.setUser_lock(0);
        user.setUser_freeze(0);
        user.setUser_power("all");
        //日期转换
        Date date = new Date();
        String strDateFormat = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        String format = sdf.format(date);
        user.setUser_register_time(Integer.parseInt(format));
        user.setUser_last_update_time(Integer.parseInt(format));
        //
        userService.save(user);
        return RespBean.error("添加成功!");
    }

    @Override
    public RespBean moveUser(User user) {
        if(userService.removeById(user)){
            return RespBean.success("移除成功！");
        }
        return RespBean.error("移除失败!",user);
    }

}
