package com.example.consumer.hystrix;

import com.cpw.commer.domain.User;
import com.example.consumer.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MyHystrix implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUserInfoByServer(Integer id) {
                User user=new User();
                user.setName("服务降级");
                user.setAddress("服务停止使用");
                return user;
            }
        };
    }
}
