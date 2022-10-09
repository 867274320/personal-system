package org.evolution.user.controller;

import org.evolution.user.dao.entities.User;
import org.evolution.user.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServer userServer;

    @ResponseBody
    @RequestMapping(value = "/queryById")
    public User queryById(@RequestBody User user) {
       return userServer.queryById(user);
    }
}
