package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@DubboService(version = "1.0.2", interfaceName = "providerServiceImpl")
public class ProviderServiceImpl implements ProviderService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public String echo(String name) {
        RpcContext context = RpcContext.getContext();
        return "Echo + " + name + " " + context.getLocalPort() + " " + context.getAttachment("rpcName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
