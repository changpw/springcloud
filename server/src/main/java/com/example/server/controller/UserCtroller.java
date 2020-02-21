package com.example.server.controller;

import com.cpw.commer.domain.User;
import com.example.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserCtroller {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/api/getUserInfo/{id}")
    @Cacheable(cacheNames = "userInfo")
    public User getUser(@PathVariable("id") Integer id){
        System.out.println("search"+id);
        return userMapper.getUserInfo(id);
    }
    @PostMapping("/api/insertUser/")
    public Integer insertUser(@RequestBody User user){ return userMapper.insertUser(user);}
    @GetMapping("api/getAllUsers")
    public List<User> getAllUsers(){return userMapper.getAllUsers();}
    @PostMapping("/api/updateUserInfo")
    public Integer updateUserInfo(@RequestBody User user){return userMapper.updateUserName(user);}
    @GetMapping("/api/deleteUser/{id}")
    public Integer deleteUser(@PathVariable("id") Integer id){return userMapper.deleteUserInfo(id);}
}

