package com.zgx.blog.controller;


import com.zgx.blog.pojo.Article;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zgx
 * @since 2021-09-10
 */
@RestController
@RequestMapping("/article")
public class ArticleController {


    @Autowired
    private IArticleService articleService;

    @ApiOperation(value = "增加文章")
    @PostMapping("/addArticle")
    public RespBean addArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }

    @ApiOperation(value = "删除文章")
    @DeleteMapping("/{id}")
    public RespBean delArticle(@PathVariable Integer id){
        return articleService.delArticle(id);
    }

    @ApiOperation(value = "修改文章")
    @PostMapping("/upArticle")
    public RespBean upArticle(@RequestBody Article article){
        return articleService.addArticle(article);
    }

    @ApiOperation(value = "展示文章")
    @GetMapping("/listArticle")
    public List<Article> selectArticle(){
        return articleService.queryArticle();
    }

    @ApiOperation(value = "查询文章")
    @PostMapping("/{id}")
    public Article queryByIdArticle(@PathVariable Integer id){
        return articleService.queryByIdArticle(id);
    }


}
