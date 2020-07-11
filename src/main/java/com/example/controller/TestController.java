package com.example.controller;

import com.example.dao.UserMapper;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("getUserInfo/{id}")
    @ResponseBody
    public User getUserInfo(@PathVariable("id") Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }



    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "World";
    }
}
