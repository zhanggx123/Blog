package com.zgx.blog.controller;


import com.zgx.blog.pojo.AboutBlog;
import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.RespPageBean;
import com.zgx.blog.service.impl.AboutBlogServiceImpl;
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
@RequestMapping("/about-blog")
public class AboutBlogController {

    @Autowired
    private AboutBlogServiceImpl aboutBlogService;

    @ApiOperation(value = "博客信息展示(分页)")
    @GetMapping("/")
    public RespPageBean showAboutBlog(@RequestParam(defaultValue = "1") Integer currentPage,
                                      @RequestParam(defaultValue = "10") Integer size){
        return aboutBlogService.showAboutBlog(currentPage,size);
    }

    @ApiOperation(value = "博客信息删除")
    @DeleteMapping("/{id}")
    public RespBean delAboutBlog(@PathVariable Integer id){
        return aboutBlogService.delAboutBlog(id);
    }

//    @ApiOperation(value = "博客信息修改")
//    @PostMapping("/{AboutBlog}")
//    public RespBean upDateAboutBlog(@PathVariable AboutBlog aboutBlog){
//        return aboutBlogService.upDataAboutBlog(aboutBlog);
//    }

//    @ApiOperation(value = "博客信息新增")
//    @PostMapping("/addAboutBlog{AboutBlog}")
//    public RespBean addAboutBlog(@PathVariable AboutBlog aboutBlog){
//        return aboutBlogService.addAboutBlog(aboutBlog);
//    }

}
