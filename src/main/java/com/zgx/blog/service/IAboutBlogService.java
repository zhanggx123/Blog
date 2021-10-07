package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.RespPageBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IAboutBlogService extends IService<AboutBlog> {

    /**
     * 增加博客信息
     */
    RespBean addAboutBlog(AboutBlog aboutBlog);

    /**
     * 删除博客信息
     */
    RespBean delAboutBlog(Integer id);

    /**
     * 修改博客信息
     */
    RespBean upDataAboutBlog(AboutBlog aboutBlog);

    /**
     * 展示博客信息
     */
    RespPageBean showAboutBlog(Integer currentPage,Integer size);

    /**
     * 根据aboutBlog id查询一条
     */
    AboutBlog queryById(Integer id);

}
