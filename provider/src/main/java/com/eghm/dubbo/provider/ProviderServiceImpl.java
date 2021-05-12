package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.concurrent.CompletableFuture;

@DubboService(version = "1.0.0", interfaceName = "providerServiceImpl")
public class ProviderServiceImpl implements ProviderService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public String echo(String name) {
        return "Echo V1 " + name;
    }

    @Override
    public CompletableFuture<String> future(String name) {
        return CompletableFuture.supplyAsync(() ->  "Echo Future " + name);
    }

    @Override
    public String async(String name) {
        RpcContext context = RpcContext.getContext();
        return "Echo Async " + name + " " + context.getAttachment("rpcName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
