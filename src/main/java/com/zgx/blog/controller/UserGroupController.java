package com.zgx.blog.controller;


import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.User;
import com.zgx.blog.service.IUserService;
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
@RequestMapping("/user-group")
public class UserGroupController {

    @Autowired
    private IUserService userService;


    /**
     * 获取all用户信息
     */
    @ApiOperation(value = "获取全部用户信息")
    @GetMapping("/")
    public RespBean getAllUserInformation(){
        return userService.getAllUser();
    }

    /**
     * 获取指定用户信息
     */
    @ApiOperation(value = "获取指定用户信息")
    @GetMapping("/{id}")
    public RespBean getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    /**
     * 添加用户
     */
    @ApiOperation(value = "添加用户")
    @PostMapping("/")
    public RespBean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    /**
     * 移除用户
     */
    @ApiOperation(value = "移除用户")
    @DeleteMapping("/")
    public RespBean moveUser(@RequestBody User user){
        return userService.moveUser(user);
    }

}
