package com.malong.controller;

import com.malong.pojo.User;
import com.malong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable Integer userId){
        User user = userService.getUserById(userId);
        return user;
    }
}
