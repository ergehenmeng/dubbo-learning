package com.eghm.dubbo.main;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @author 殿小二
 * @date 2021/4/16
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName();
        System.out.println(name);
        System.out.println(Integer.parseInt(name.substring(0, name.indexOf('@'))));
        Thread.sleep(1000000L);
    }
}
