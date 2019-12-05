package com.springboot.gmall.user;

import com.springboot.gmall.user.mapper.UserMapper;
import com.springboot.gmall.user.pojo.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallUserApplicationTests {
@Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<UmsMember> members = userMapper.getAll();
        UmsMember umsMember= members.get(0);
        System.out.println(umsMember);
    }

}
