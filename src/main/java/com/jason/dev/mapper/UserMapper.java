package com.jason.dev.mapper;

import com.jason.dev.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Jason.yu on 2016/11/28.
 */
public interface UserMapper
{
    //采用数据映射器（MapperFactoryBean）的方式，不用写mybatis映射文件，采用注解方式提供相应的sql语句和输入参数
    @Select("SELECT * FROM user_test WHERE user_id = #{userId}")
    User getUserByUid(@Param("userId")int id);
}
