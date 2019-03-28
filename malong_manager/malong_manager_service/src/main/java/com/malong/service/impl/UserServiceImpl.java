package com.malong.service.impl;

import com.malong.mapper.UserMapper;
import com.malong.pojo.User;
import com.malong.pojo.UserExample;
import com.malong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        UserExample userExample= new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> usersList = userMapper.selectByExample(userExample);
        if(usersList!=null){
            return usersList.get(0);
        }
        return null;
    }
}
