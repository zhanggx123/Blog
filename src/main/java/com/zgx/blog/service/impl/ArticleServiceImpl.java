package com.zgx.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zgx.blog.mapper.ArticleMapper;
import com.zgx.blog.pojo.Article;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {


    @Autowired
    private IArticleService articleService;

    @Override
    public RespBean addArticle(Article article) {
        if(articleService.save(article)){
            return RespBean.success("添加成功");
        }else {
            return RespBean.error("添加失败!");
        }
    }

    @Override
    public RespBean delArticle(Integer  id) {

        if(articleService.removeById(id)){
            return RespBean.success("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @Override
    public RespBean upArticle(Article article) {
        if(articleService.updateById(article)){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @Override
    public List<Article> queryArticle() {
        List<Article> articleList = articleService.list();
        return articleList;
    }
}
