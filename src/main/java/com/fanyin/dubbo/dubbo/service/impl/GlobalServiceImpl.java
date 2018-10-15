package com.fanyin.dubbo.dubbo.service.impl;

import com.fanyin.dubbo.dubbo.service.GlobalService;

/**
 * @author 王艳兵
 * @date 2018/10/15 16:38
 */
public class GlobalServiceImpl implements GlobalService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
