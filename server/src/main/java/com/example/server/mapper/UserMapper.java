package com.example.server.mapper;
import com.cpw.commer.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
     User getUserInfo(Integer id);
//    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user (name,id,age,address)values(#{name},#{id},#{age},#{address})")
    Integer insertUser(User user);
    @Select("select * from user")
     List<User> getAllUsers();
    @Update("update user set name=#{name},age=#{age},address=#{address}where id = #{id}")
    Integer updateUserName(User user);
    @Delete("delete from user where id=#{id}")
    Integer deleteUserInfo(Integer id);

}

