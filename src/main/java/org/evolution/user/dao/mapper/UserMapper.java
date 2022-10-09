package org.evolution.user.dao.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.evolution.user.dao.entities.User;

@Mapper
public interface UserMapper {

    public User queryById(User user);
}
