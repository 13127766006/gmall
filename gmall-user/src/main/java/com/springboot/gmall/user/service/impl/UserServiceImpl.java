package com.springboot.gmall.user.service.impl;

import com.springboot.gmall.service.UserService;
import com.springboot.gmall.user.mapper.UserMapper;
import com.springboot.gmall.pojo.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAll() {
        return userMapper.selectAll();
    }
}
