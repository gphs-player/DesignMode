package com.design.proxy.game.version4;

import java.lang.reflect.Proxy;

public class GameDynamicProxy  {



    public static <T extends IGamePlayer> T getInstance(IGamePlayer player) {

        if (true) {
            Boolean check = new LoginCheck().check(player.toString());
            if (check != null && check) {
                System.err.println("登录信息过期");
            } else {
                System.err.println("登录信息正常");

            }
        }

        MyInvocationHandler handler = new MyInvocationHandler(player);

        @SuppressWarnings("unchecked")
        T r = (T) Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), handler);
        return r;
    }

}
