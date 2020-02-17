package com.example.server.controller;

import com.cpw.commer.domain.User;
import com.example.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtroller {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/api/getUserInfo/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userMapper.getUserInfo(id);
    }
}
