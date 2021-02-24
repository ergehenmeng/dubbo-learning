package com.eghm.dubbo.bytecode;

import org.apache.dubbo.common.bytecode.Wrapper;

/**
 * 采用javassist生成Invoker时会对原始类进行包装, 底层生成java文件如下
 * @author 殿小二
 * @date 2021/2/24
 */
public class Wrapper0 extends Wrapper {

    public static String[] pns;
    public static java.util.Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;

    @Override
    public String[] getPropertyNames() {
        return pns;
    }


    @Override
    public Class getPropertyType(String n) {
        return (Class) pts.get(n);
    }

    @Override
    public boolean hasProperty(String n) {
        return pts.containsKey(n);
    }

    @Override
    public Object getPropertyValue(Object o, String n) {
        com.eghm.dubbo.service.ProviderService w;
        try {
            w = ((com.eghm.dubbo.service.ProviderService) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + n + "\" field or setter method in class com.eghm.dubbo.service.ProviderService.");
    }

    @Override
    public void setPropertyValue(Object o, String n, Object v) {
        com.eghm.dubbo.service.ProviderService w;
        try {
            w = ((com.eghm.dubbo.service.ProviderService) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + n + "\" field or setter method in class com.eghm.dubbo.service.ProviderService.");
    }


    @Override
    public String[] getMethodNames() {
        return mns;
    }

    @Override
    public String[] getDeclaredMethodNames() {
        return dmns;
    }


    @Override
    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
        com.eghm.dubbo.service.ProviderService w;
        try {
            w = ((com.eghm.dubbo.service.ProviderService) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("echo".equals(n) && p.length == 1) {
                return w.echo((java.lang.String) v[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + n + "\" in class com.eghm.dubbo.service.ProviderService.");
    }
}
