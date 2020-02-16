package com.test.service.user;


import com.test.model.User;
import com.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andy on 2016/12/20.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user){
        userDao.insert(user);
    }

    public void addTest(User user){
        userDao.insert(user);
        User user2 = null;
        String nickname = user2.getNickname();
    }
}
