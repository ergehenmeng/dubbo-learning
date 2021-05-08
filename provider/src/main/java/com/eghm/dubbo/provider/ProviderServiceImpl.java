package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@DubboService(version = "1.0.2", interfaceName = "providerServiceImpl")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String echo(String name) {
        RpcContext context = RpcContext.getContext();
        return "Echo + " + name + " " + context.getLocalPort() + " " + context.getAttachment("rpcName");
    }
}
