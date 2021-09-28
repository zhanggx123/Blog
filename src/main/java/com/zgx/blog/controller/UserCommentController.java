package com.zgx.blog.controller;


import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserComment;
import com.zgx.blog.service.IUserCommentService;
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
@RequestMapping("/user-comment")
public class UserCommentController {

    @Autowired
    private IUserCommentService userCommentService;

    @ApiOperation(value = "新增评论")
    @PostMapping("/{UserComment}")
    public RespBean addComment(@PathVariable UserComment userComment){
        return userCommentService.addComment(userComment);
    }

    @ApiOperation(value = "删除评论")
    @DeleteMapping("/{UserComment")
    public RespBean delComment(@PathVariable UserComment userComment){
        return userCommentService.delComment(userComment);
    }

    @ApiOperation(value = "展示评论")
    @GetMapping("/")
    public List<UserComment> showComment(){
        return userCommentService.showComment();
    }

}