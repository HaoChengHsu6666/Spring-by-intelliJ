package com.example.demo4.mapper;

import com.example.demo4.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User findById(long id);

    Integer insertUser (User user);

    Integer updateById (long id,User user);

    Integer deleteUserById(long id);

}
