package com.example.demo4.service;


import com.example.demo4.entity.User;

import java.util.List;

public interface UserService  {
    User findById(long id);

    Integer insertUser(User user);

    Integer updateById(long id,User user);

    Integer deleteUserById(long id);

}
