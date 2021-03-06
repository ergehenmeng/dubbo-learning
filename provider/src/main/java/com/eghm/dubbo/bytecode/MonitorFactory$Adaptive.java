package com.eghm.dubbo.bytecode;


import org.apache.dubbo.common.extension.ExtensionLoader;


/**
 * @author 殿小二
 * @date 2021/2/24
 */
public class MonitorFactory$Adaptive implements org.apache.dubbo.monitor.MonitorFactory {

    @Override
    public org.apache.dubbo.monitor.Monitor getMonitor(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("url == null");
        }
        org.apache.dubbo.common.URL url = arg0;
        String extName = (url.getProtocol() == null ? "dubbo" : url.getProtocol());
        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.monitor.MonitorFactory) name from url (" + url.toString() + ") use keys([protocol])");
        }
        org.apache.dubbo.monitor.MonitorFactory extension = (org.apache.dubbo.monitor.MonitorFactory) ExtensionLoader.getExtensionLoader(org.apache.dubbo.monitor.MonitorFactory.class).getExtension(extName);
        return extension.getMonitor(arg0);
    }
}
