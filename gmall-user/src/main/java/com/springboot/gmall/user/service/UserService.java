package com.springboot.gmall.user.service;

import com.springboot.gmall.user.pojo.UmsMember;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    public List<UmsMember> getAll();
}
