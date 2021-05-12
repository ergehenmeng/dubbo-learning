package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author 殿小二
 * @date 2021/5/8
 */
@DubboService(version = "2.0.0", interfaceName = "versionProviderServiceImpl")
public class VersionProviderServiceImpl implements ProviderService {

    @Override
    public String echo(String name) {
        return  "Echo V2 " + name;
    }

    @Override
    public String async(String name) {
        return null;
    }

    @Override
    public CompletableFuture<String> future(String name) {
        return null;
    }

}
