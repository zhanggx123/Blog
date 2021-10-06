package com.zgx.blog.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zgx.blog.service.impl.OtherApiServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/OtherApi")
public class OtherAPIController {

    @Autowired
    private OtherApiServiceImpl otherApiService;

    @ApiOperation(value = "新闻API")
    @GetMapping("/news")
    public String newsApi(){
       String url="http://c.m.163.com/nc/article/headline/T1348647853363/0-40.html";
       return otherApiService.newsApi(url);
    }



}
