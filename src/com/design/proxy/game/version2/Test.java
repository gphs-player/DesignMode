package com.design.proxy.game.version2;

public class Test {
    public static void main(String [] args){
        //这样就只暴露了代理，完全隐藏了真实的被代理对象，Gameplayer的改变不会影响这里。
        IGamePlayer proxy = new GamePlayerProxy("zhangsan");
        proxy.login("zhangsan");
        proxy.killBoss();
        proxy.upgrade();

    }
}
