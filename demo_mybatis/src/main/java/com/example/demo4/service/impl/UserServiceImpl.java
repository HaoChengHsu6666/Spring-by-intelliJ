package com.example.demo4.service.impl;

import com.example.demo4.entity.User;
import com.example.demo4.mapper.UserMapper;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(long id) {
        return userMapper.findById(id);
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer updateById(long id,User user){ return userMapper.updateById(id,user);}

    @Override
    public Integer deleteUserById(long id) {
        return userMapper.deleteUserById(id);
    }

 }
