package com.fanyin.dubbo.dubbo;

/**
 * @author 王艳兵
 * @date 2018/10/17 17:15
 */
public class Thread {
    public static void main(String[] args)throws Exception {
        Object object = new Object();
        synchronized (object){
            object.wait(10000);
        }

    }
}
