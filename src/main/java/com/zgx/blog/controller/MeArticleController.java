package com.zgx.blog.controller;


import com.zgx.blog.pojo.MeArticle;
import com.zgx.blog.service.IMeArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zgx
 * @since 2021-08-19
 */
@RestController
public class MeArticleController {

    @Autowired
    private IMeArticleService meArticleService;

    @ApiOperation(value = "查询全部文章")
    @GetMapping("/query/articleAll")
    public List<MeArticle> queryArticleALl(){
        return meArticleService.queryArticleAll();
    }

}
