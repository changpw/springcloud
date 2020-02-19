package com.example.consumer.service;

import com.cpw.commer.domain.User;
import com.example.consumer.hystrix.MyHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-server",fallbackFactory = MyHystrix.class)
public interface UserService {
    @GetMapping("/api/getUserInfo/{id}")
     User getUserInfoByServer(@PathVariable("id") Integer id);
}
