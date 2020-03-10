package com.design.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:lihua
 * Date:2017/7/19
 * Description:
 */
public class ProxyHandler implements InvocationHandler {
    private ProductOutput mTarget;

    public ProxyHandler(ProductOutput o) {
        this.mTarget = o;
    }
    public ProductOutput proxy(){
        ProductOutput o = (ProductOutput) Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始前");
        Object invoke = method.invoke(mTarget, args);
        System.out.println("代理开始后");
        return invoke;
    }
}
