package com.fanyin.dubbo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:08
 */
public class StartProvider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
