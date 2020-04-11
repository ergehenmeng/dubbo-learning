package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String echo(String name) {
        RpcContext context = RpcContext.getContext();
        return "Echo + " + name + " " + context.getLocalPort();
    }
}
