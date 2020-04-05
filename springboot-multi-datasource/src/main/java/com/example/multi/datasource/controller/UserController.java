package com.example.multi.datasource.controller;

import com.example.multi.datasource.domain.User;
import com.example.multi.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user-add")
    public String add(){
        User user = new User();
        user.setNickName("zhangl");
        user.setPassWord("13128600812");
        user.setUserName("zhangl");
        return userService.addUser(user)?"插入成功":"插入失败";
    }

}
