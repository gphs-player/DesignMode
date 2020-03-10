package com.design.proxy.game.version1;

public class Test {
    public static void main(String [] args){
        //GamePlayer还是直接暴露了下个版本隐藏
        IGamePlayer player = new GamePlayer("zhangsan");
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.login("zhangsan");
        proxy.killBoss();
        proxy.upgrade();

    }
}
