package com.zgx.blog.controller;


import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.UserAttention;
import com.zgx.blog.service.IUserAttentionService;
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
@RequestMapping("/user-attention")
public class UserAttentionController {

    @Autowired
    private IUserAttentionService userAttentionService;

    @ApiOperation(value = "新增关注")
    @PostMapping("/{UserAttention}")
    public RespBean addUserAttention(@PathVariable UserAttention userAttention){
        return userAttentionService.addUserAttention(userAttention);
    }

    @ApiOperation(value = "取消关注")
    @DeleteMapping("/{UserAttention}")
    public RespBean delUserAttention(@PathVariable UserAttention userAttention){
        return userAttentionService.delUserAttention(userAttention);
    }
    
    @ApiOperation(value = "展示列表关注")
    @PostMapping("/show/{UserAttention}")
    public List<UserAttention> showUserAttention(){
        return null;
    }

}
