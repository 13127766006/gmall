package com.springboot.gmall.user;

import com.springboot.gmall.user.mapper.UserMapper;
import com.springboot.gmall.pojo.UmsMember;
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
        //List<UmsMember> umsMembers = userMapper.selectAll();
        //UmsMember umsMember= umsMembers.get(0);
        //System.out.println(umsMember);
        UmsMember umsMember = userMapper.selectByPrimaryKey(1);
        System.out.println(umsMember);
    }
}
