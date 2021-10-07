package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.AboutBlogMapper;
import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.RespPageBean;
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
    @Autowired
    private AboutBlogMapper aboutBlogMapper;

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
    public RespPageBean showAboutBlog(Integer currentPage,Integer size) {
//        List<AboutBlog> list=new ArrayList<>();
//        list = aboutBlogService.list();
        Page<AboutBlog> page = new Page<>(currentPage, size);
        IPage<AboutBlog> aboutBlogIPage = aboutBlogMapper.showAboutBlog(page);
        RespPageBean respPageBean = new RespPageBean(aboutBlogIPage.getTotal(), aboutBlogIPage.getRecords());
        return respPageBean;

    }

    @Override
    public AboutBlog queryById(Integer id) {
        return aboutBlogMapper.selectById(id);
    }


}