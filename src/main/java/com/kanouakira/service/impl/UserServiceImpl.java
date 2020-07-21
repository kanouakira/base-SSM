package com.kanouakira.service.impl;

import com.kanouakira.domain.User;
import com.kanouakira.mapper.UserMapper;
import com.kanouakira.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
