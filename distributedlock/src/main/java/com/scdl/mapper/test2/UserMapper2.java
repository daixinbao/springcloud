package com.scdl.mapper.test2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by daixn on 2019/6/30 14:31
 */
@Mapper
public interface UserMapper2 {

    @Insert("insert into test_user(name,age) values(#{name},#{age})")
    void addUser(@Param("name") String name, @Param("age") int age);
}