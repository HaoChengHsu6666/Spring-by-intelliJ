package com.example.demo4.controller;

import com.example.demo4.entity.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @PostMapping("")
    public Integer insertUser(@RequestBody User user){
        System.out.println("執行insert User by mybatis");
        return userService.insertUser(user);
    }

    @PutMapping("/{id}")
    public Integer updateById(@PathVariable long id,@RequestBody User user){
        System.out.println("執行update User by mybatis");
        return userService.updateById(id,user);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable long id){
        return userService.deleteUserById(id);
    }

}
