package com.scdl.service;

import com.scdl.mapper.test1.UserMapper1;
import com.scdl.mapper.test2.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by daixn on 2019/6/30 14:32
 */
@Service
public class UserService {

    @Autowired
    private UserMapper1 userMapper1;
    @Autowired
    private UserMapper2 userMapper2;

    @Transactional
    public void addUser(User user)throws Exception{
        userMapper1.addUser(user.getName(),user.getAge());
        userMapper2.addUser(user.getName(),user.getAge());
    }
}
