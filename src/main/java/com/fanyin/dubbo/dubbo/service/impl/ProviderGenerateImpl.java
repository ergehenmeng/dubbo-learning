package com.fanyin.dubbo.dubbo.service.impl;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;

/**
 * @author 王艳兵
 * @date 2018/10/17 18:30
 */
public class ProviderGenerateImpl implements GenericService {
    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        if("generate".equals(method)){
            return "服务端泛化:" + args[0];
        }
        return null;
    }
}
