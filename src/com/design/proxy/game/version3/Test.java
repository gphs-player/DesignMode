package com.design.proxy.game.version3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhangsan");
        InvocationHandler proxyHandler = new GameplayLH(gamePlayer);
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), gamePlayer.getClass().getInterfaces(), proxyHandler);
        proxy.login("zhangsan");
        proxy.killBoss();
        proxy.upgrade();
    }
}
