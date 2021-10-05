package com.zgx.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.Article;
import com.zgx.blog.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
public interface IArticleService extends IService<Article> {

    /**
     * 增加文章
     */
    RespBean addArticle(Article article, AboutBlog aboutBlog);


    /**
     * 删除文章
     */
    RespBean delArticle(Integer id);

    /**
     * 修改文章
     */
    RespBean upArticle(Article article);

    /**
     * 查询全部文章list
     */
    List<Article> queryArticle();

    /**
     * 查询文章
     */
    Article queryByIdArticle(Integer id);

}
