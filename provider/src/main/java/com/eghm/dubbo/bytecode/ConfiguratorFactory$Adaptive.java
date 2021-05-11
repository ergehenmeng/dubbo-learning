package com.eghm.dubbo.bytecode;


import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author 殿小二
 * @date 2021/2/24
 */
public class ConfiguratorFactory$Adaptive implements org.apache.dubbo.rpc.cluster.ConfiguratorFactory {

    @Override
    public org.apache.dubbo.rpc.cluster.Configurator getConfigurator(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("url == null");
        }
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getProtocol();
        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.rpc.cluster.ConfiguratorFactory) name from url (" + url.toString() + ") use keys([protocol])");
        }
        org.apache.dubbo.rpc.cluster.ConfiguratorFactory extension = (org.apache.dubbo.rpc.cluster.ConfiguratorFactory) ExtensionLoader.getExtensionLoader(org.apache.dubbo.rpc.cluster.ConfiguratorFactory.class).getExtension(extName);
        return extension.getConfigurator(arg0);
    }
}
