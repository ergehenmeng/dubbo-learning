package com.fanyin.dubbo.dubbo.service;

import com.fanyin.dubbo.dubbo.model.User;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:10
 */
public interface FirstService {

    /**
     * dubbo provider
     * @param name name
     * @return hello name
     */
    String say(String name);

    /**
     * @param name
     * @param age
     * @param sex
     * @return
     */
    User createUser(String name,int age,String sex);

}

