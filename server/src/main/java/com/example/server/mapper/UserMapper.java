package com.example.server.mapper;
import com.cpw.commer.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from user where id=${id}")
     User getUserInfo(Integer id);
}
