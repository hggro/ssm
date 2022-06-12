package com.service;

import com.dao.UserMapper;
import com.pojo.User;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(User user) {
        return userMapper.login(user);
    }


}
