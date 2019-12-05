package com.springboot.gmall.user.service.impl;

import com.springboot.gmall.user.mapper.UserMapper;
import com.springboot.gmall.user.pojo.UmsMember;
import com.springboot.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAll() {
        return userMapper.getAll();
    }
}
