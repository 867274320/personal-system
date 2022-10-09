package org.evolution.user.service.impl;

import org.evolution.user.dao.entities.User;
import org.evolution.user.dao.mapper.UserMapper;
import org.evolution.user.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    public User queryById(User entity) {


        System.out.println(userMapper);
        return userMapper.queryById(entity);
    }
}
