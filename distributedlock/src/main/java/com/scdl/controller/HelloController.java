package com.scdl.controller;

import com.scdl.lock.DistributedLockHandler;
import com.scdl.lock.Lock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daixn on 2019/6/26 20:50
 */
@RestController
public class HelloController {
    @Autowired
    private DistributedLockHandler distributedLockHandler;

    @RequestMapping("index")
    public String index() {
        Lock lock=new Lock("lynn","min");
        if(distributedLockHandler.tryLock(lock)){
            try {
                //为了演示锁的效果，这里睡眠5000毫秒
                System.out.println("执行方法");
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            distributedLockHandler.releaseLock(lock);
        }
        return "hello world!";
    }
}
