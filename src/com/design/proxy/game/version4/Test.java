package com.design.proxy.game.version4;

public class Test {

    public static void main(String [] args){
        IGamePlayer playerA = new GamePlayer("zhangsan");
        IGamePlayer playerB = new GamePlayer("lisi");
//        IGamePlayer instance = DynamicProxy.getInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), new MyInvocationHandler(player));
        IGamePlayer gamePlayerA = GameDynamicProxy.getInstance(playerA);
        IGamePlayer gamePlayerB = GameDynamicProxy.getInstance(playerB);
        gamePlayerA.login("zhangsan");
        gamePlayerB.upgrade();

    }
}
