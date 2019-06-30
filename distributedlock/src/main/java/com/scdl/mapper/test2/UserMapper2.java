package com.scdl.mapper.test2;

/**
 * Created by daixn on 2019/6/30 14:31
 */
@Mapper
public interface UserMapper2 {

    @Insert("insert into test_user(name,age) values(#{name},#{age})")
    void addUser(@Param("name") String name,@Param("age") int age);
}