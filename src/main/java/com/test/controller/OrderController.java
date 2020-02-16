package com.test.controller;


import com.test.model.User;
import com.test.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list")
    public Object getUser(){
        String openId = "{2}";
        return openId;
    }

    @RequestMapping(value = "add")
    public Object addUser(){
        User user = new User();
        user.setNickname("文卓");
        user.setSex(1);
        user.setStatus(10);
        userService.add(user);
        String result = "add ok";
        return result;
    }

    @RequestMapping(value = "addt")
    public Object addUserTest(){
        User user = new User();
        user.setNickname("文卓");
        user.setSex(1);
        user.setStatus(10);
        userService.addTest(user);
        String result = "add ok";
        return result;
    }

}
