package com.design.proxy.game.version2;

/**
 * 游戏代练
 */
public class GamePlayerProxy implements IGamePlayer {

    IGamePlayer gamePlayer;
    public GamePlayerProxy(String name) {
        this.gamePlayer = new GamePlayer(this,name);
    }

    @Override
    public void login(String name) {
        this.gamePlayer.login(name);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
