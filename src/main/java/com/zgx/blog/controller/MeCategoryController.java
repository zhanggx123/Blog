package com.zgx.blog.controller;


import com.zgx.blog.pojo.MeCategory;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.service.IMeCategoryService;
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
@RequestMapping("/me-category")
public class MeCategoryController {

    @Autowired
    private IMeCategoryService meCategoryService;


    @ApiOperation(value = "获取文章类型")
    @GetMapping("/article/type")
    public List<MeCategory> getArticleType(){
        return meCategoryService.getArticleType();
    }

}
