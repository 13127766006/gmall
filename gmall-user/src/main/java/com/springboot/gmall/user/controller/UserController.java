package com.springboot.gmall.user.controller;

import com.springboot.gmall.pojo.UmsMember;
import com.springboot.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/index")
    public List<UmsMember> index(){
        List<UmsMember> members = userService.getAll();

        return members;
    }
}
