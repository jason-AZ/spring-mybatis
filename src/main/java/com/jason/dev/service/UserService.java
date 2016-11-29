package com.jason.dev.service;

import com.jason.dev.entity.User;
import com.jason.dev.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jason.yu on 2016/11/29.
 */
@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id)
    {
        return userMapper.getUserByUid(id);
    }

}
