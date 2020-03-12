package com.design.proxy.game.version3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 拦截操作
 */
public class GameplayLH implements InvocationHandler {

    Object obj;

    public GameplayLH(Object object) {
        obj = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("login")) {
            System.err.println(System.currentTimeMillis() + " :::账号异地登录！！！");
        }
        Object invoke = method.invoke(obj, args);
        if (method.getName().equalsIgnoreCase("upgrade")) {
            System.err.println(System.currentTimeMillis() + " :::账号已经升级，谨防被盗！！！");
        }
        return invoke;
    }
}
