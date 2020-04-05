package com.example.multi.datasource.service.impl;

import com.example.multi.datasource.domain.User;
import com.example.multi.datasource.mapper.db1.UserMapper;
import com.example.multi.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        userMapper.insert(user);
        return true;
    }
}
