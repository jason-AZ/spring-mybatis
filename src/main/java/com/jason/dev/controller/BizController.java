package com.jason.dev.controller;

import com.jason.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Jason.yu on 2016/11/29.
 */
@Controller
public class BizController
{
    @Autowired
    private UserService userService;


}
