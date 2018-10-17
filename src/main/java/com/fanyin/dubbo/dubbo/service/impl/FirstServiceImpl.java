package com.fanyin.dubbo.dubbo.service.impl;

import com.fanyin.dubbo.dubbo.model.User;
import com.fanyin.dubbo.dubbo.service.FirstService;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:11
 */
public class FirstServiceImpl implements FirstService {

    @Override
    public String say(String name) {
        return "hello " + name ;
    }

    @Override
    public User createUser(String name, int age, String sex) {

        return new User(age,name,sex);
    }

    @Override
    public void say(String name, String value) {
        System.out.println("name:" + name +  " value:" + value);
    }
}
