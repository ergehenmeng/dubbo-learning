package com.eghm.dubbo.provider;

import com.eghm.dubbo.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 殿小二
 * @date 2021/5/8
 */
@DubboService(version = "2.0.0", interfaceName = "versionProviderServiceImpl")
public class VersionProviderServiceImpl implements ProviderService {
    @Override
    public String echo(String name) {
        return name + " v2.0.0";
    }
}
