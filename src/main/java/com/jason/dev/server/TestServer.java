package com.jason.dev.server;

import com.jason.dev.entity.User;
import com.jason.dev.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jason.yu on 2016/11/29.
 */
public class TestServer
{
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("mybatis-spring.xml");

        UserService service = (UserService) ac.getBean("userService");

        User user = service.getUser(1);

        System.out.println(user.toString());

    }
}
