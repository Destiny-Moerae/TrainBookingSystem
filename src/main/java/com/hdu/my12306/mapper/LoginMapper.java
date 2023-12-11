package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface LoginMapper {

    @Select("select * from user where u_phone=#{uPhone} and u_pwd=#{uPwd}")
    User login1(User user);

}
