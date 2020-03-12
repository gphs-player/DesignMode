package com.design.proxy.game.version4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {


    public static <T> T getInstance(ClassLoader classLoader, Class[] interfaces, InvocationHandler h) {

        if (true) {
            Boolean check = new LoginCheck().check("");
            if (check != null && check) {
                System.err.println("登录信息过期");
            } else {
                System.err.println("登录信息正常");

            }
        }

        return (T) Proxy.newProxyInstance(classLoader, interfaces, h);
    }

}
