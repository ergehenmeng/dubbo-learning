package com.fanyin.dubbo.dubbo;

import com.fanyin.dubbo.dubbo.model.User;
import com.fanyin.dubbo.dubbo.service.GlobalService;
import com.fanyin.dubbo.dubbo.service.FirstService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:19
 */
public class StartCustom {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom.xml");
        context.start();
        FirstService provider = (FirstService) context.getBean("firstService");
        String say = provider.say("二哥");
        System.out.println("首个方法调用:" + say);
        User user = provider.createUser("三哥", 11, "男");
        System.out.println("user信息:" + user);

        GlobalService globalService = (GlobalService) context.getBean("globalService");
        int add = globalService.add(1, 4);
        System.out.println("相加的结果:" + add);
        System.in.read();
    }
}
