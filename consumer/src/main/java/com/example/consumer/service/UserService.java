package com.example.consumer.service;

import com.cpw.commer.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-server")
public interface UserService {
    @GetMapping("/api/getUserInfo/{id}")
     User getUserInfoByServer(@PathVariable("id") Integer id);
}
