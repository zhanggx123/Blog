package com.zgx.blog.controller;


import com.zgx.blog.pojo.MeArticleBody;
import com.zgx.blog.service.IMeArticleBodyService;
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
@RequestMapping("/me-article-body")
public class MeArticleBodyController {

    @Autowired
    private IMeArticleBodyService meArticleBodyService;

    @ApiOperation(value = "获取内容")
    @GetMapping("/article/body")
    public List<MeArticleBody> getAllArticleBody(){
        return meArticleBodyService.getAllArticleBody();
    }

}
