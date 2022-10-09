package org.evolution.user.service;

import org.evolution.user.dao.entities.User;

public interface UserServer {

    public User queryById(User entity);
}
