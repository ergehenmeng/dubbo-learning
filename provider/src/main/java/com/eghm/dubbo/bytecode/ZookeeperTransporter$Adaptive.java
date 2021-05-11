package com.eghm.dubbo.bytecode;


import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author 殿小二
 * @date 2021/2/24
 */
public class ZookeeperTransporter$Adaptive implements org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter {

    @Override
    public org.apache.dubbo.remoting.zookeeper.ZookeeperClient connect(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("url == null");
        }
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getParameter("client", url.getParameter("transporter", "curator"));
        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter) name from url (" + url.toString() + ") use keys([client, transporter])");
        }
        org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter extension = (org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter) ExtensionLoader.getExtensionLoader(org.apache.dubbo.remoting.zookeeper.ZookeeperTransporter.class).getExtension(extName);
        return extension.connect(arg0);
    }
}