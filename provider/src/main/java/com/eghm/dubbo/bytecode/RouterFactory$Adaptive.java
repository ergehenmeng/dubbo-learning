package com.eghm.dubbo.bytecode;

/**
 * @author 殿小二
 * @date 2021/2/24
 */
import org.apache.dubbo.common.extension.ExtensionLoader;
public class RouterFactory$Adaptive implements org.apache.dubbo.rpc.cluster.RouterFactory {

    @Override
    public org.apache.dubbo.rpc.cluster.Router getRouter(org.apache.dubbo.common.URL arg0)  {
        if (arg0 == null) {
            throw new IllegalArgumentException("url == null");
        }
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getProtocol();
        if(extName == null) {
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.rpc.cluster.RouterFactory) name from url (" + url.toString() + ") use keys([protocol])");
        }
        org.apache.dubbo.rpc.cluster.RouterFactory extension = (org.apache.dubbo.rpc.cluster.RouterFactory)ExtensionLoader.getExtensionLoader(org.apache.dubbo.rpc.cluster.RouterFactory.class).getExtension(extName);
        return extension.getRouter(arg0);
    }
}