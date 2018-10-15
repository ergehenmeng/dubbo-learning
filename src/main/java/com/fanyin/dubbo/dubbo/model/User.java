package com.fanyin.dubbo.dubbo.model;

import java.io.Serializable;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:32
 */
public class User implements Serializable {
    
    /**
     * 年龄
     */
    private int age;

    public User(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
