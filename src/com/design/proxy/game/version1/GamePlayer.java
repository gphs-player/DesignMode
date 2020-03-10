package com.design.proxy.game.version1;

/**
 * 真实的游戏角色
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name) {
        System.out.println(name + "：登录游戏。");
    }

    @Override
    public void killBoss() {
        System.out.println(name + "：在打怪。");

    }

    @Override
    public void upgrade() {
        System.out.println(name + "：升级成功！");

    }
}
