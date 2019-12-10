package com.springboot.gmall.user.mapper;

import com.springboot.gmall.pojo.UmsMember;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    //@Select("Select *from ums_member")
    //List<UmsMember> getAll();
}
