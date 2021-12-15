package com.mapper;

import com.entity.Member;
import com.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> gets();
    User get(int id);
    int add(User user);
    int update(User user);
    int delete(int id);
}
