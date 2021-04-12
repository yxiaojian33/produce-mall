package com.xiaojian.upc.controller;

import com.xiaojian.upc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private UserMapper userMapper;
    @GetMapping("/hello")
    public String hello(){
        return userMapper.getAllUsers().toString();
    }
}
