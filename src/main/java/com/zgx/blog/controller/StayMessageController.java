package com.zgx.blog.controller;


import com.zgx.blog.pojo.RespBean;
import com.zgx.blog.pojo.StayMessage;
import com.zgx.blog.service.IStayMessageService;
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
@RequestMapping("/stay-message")
public class StayMessageController {

    @Autowired
    private IStayMessageService stayMessageService;

    @ApiOperation(value = "添加留言")
    @PostMapping("/addMessage")
    public RespBean addMessage(@RequestBody StayMessage stayMessage){
        return stayMessageService.addMessage(stayMessage);
    }

    @ApiOperation(value = "删除留言")
    @DeleteMapping("/{id}")
    public RespBean delMessage(@PathVariable Integer id){
        return stayMessageService.delMessage(id);
    }

    @ApiOperation(value = "展示留言")
    @GetMapping("/")
    public List<StayMessage> showMessage(){
        return stayMessageService.selectMessage();
    }




}
