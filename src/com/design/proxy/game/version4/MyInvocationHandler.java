package com.design.proxy.game.version4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Handler
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object obj;
    public MyInvocationHandler(Object arg) {
        obj = arg;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}
