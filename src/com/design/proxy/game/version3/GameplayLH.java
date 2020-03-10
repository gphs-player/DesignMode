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
        if (method.getName().equalsIgnoreCase("login")){
            System.err.println("账号异地登录！！！");
        }
        return method.invoke(obj,args);
    }
}
