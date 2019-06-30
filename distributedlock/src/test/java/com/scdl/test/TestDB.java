package com.scdl.test;

import com.scdl.ApplicationDistributeLock;
import com.scdl.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by daixn on 2019/6/30 14:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationDistributeLock.class)
public class TestDB {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User user = new User();
        user.setName("lynn");
        user.setAge(10);
        try {
            userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}