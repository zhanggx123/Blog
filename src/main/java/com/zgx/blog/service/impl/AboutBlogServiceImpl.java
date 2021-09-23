package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.AboutBlogMapper;
import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IAboutBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class AboutBlogServiceImpl extends ServiceImpl<AboutBlogMapper, AboutBlog> implements IAboutBlogService {

    @Autowired
    private AboutBlogServiceImpl aboutBlogService;

    @Override
    public RespBean addAboutBlog(AboutBlog aboutBlog) {
        if(aboutBlogService.save(aboutBlog))
            return RespBean.success("添加成功!");
        return RespBean.error("添加失败!");
    }

    @Override
    public RespBean delAboutBlog(Integer id) {
        if(aboutBlogService.removeById(id))
            return RespBean.success("删除成功!");
        return RespBean.error("删除失败!");
    }

    @Override
    public RespBean upDataAboutBlog(AboutBlog aboutBlog) {
        if(aboutBlogService.updateById(aboutBlog))
            return RespBean.success("删除成功!");
        return RespBean.error("删除失败!");
    }

    @Override
    public List<AboutBlog> showAboutBlog() {
        List<AboutBlog> list=new ArrayList<>();
        list = aboutBlogService.list();
        return list;

    }
}