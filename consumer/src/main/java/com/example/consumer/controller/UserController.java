package com.example.consumer.controller;
import com.cpw.commer.domain.User;
import com.example.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/api/consumer/getUserInfo/{id}")
    public User getUserInfo(@PathVariable("id") Integer id){
        return userService.getUserInfoByServer(id);
    }
}
