package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //@Param("user")注解
    int insert(@Param("user") User user);
    User selectById(@Param("userId") int userId);
}
