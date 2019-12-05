package com.springboot.gmall.user.mapper;

import com.springboot.gmall.user.pojo.UmsMember;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("Select *from ums_member")
    List<UmsMember> getAll();
}
