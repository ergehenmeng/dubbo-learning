package com.fanyin.dubbo.dubbo.service.impl;

import com.fanyin.dubbo.dubbo.service.ProviderNotGenerate;

/**
 * @author 二哥很猛
 * @date 2018/10/17 18:22
 */
public class ProviderNotGenerateImpl implements ProviderNotGenerate {
    @Override
    public String hello(String name) {
        return "服务端没有泛化:" + name;
    }
}
