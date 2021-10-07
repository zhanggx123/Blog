package com.zgx.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface AboutBlogMapper extends BaseMapper<AboutBlog> {

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
    IPage<AboutBlog> showAboutBlog(Page<AboutBlog> page);

}
