package com.test.dao;

import com.test.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao  {
    Integer insert(User user);
}