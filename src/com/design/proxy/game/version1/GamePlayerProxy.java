package com.design.proxy.game.version1;

/**
 * 游戏代练
 */
public class GamePlayerProxy implements IGamePlayer {

    IGamePlayer gamePlayer;
    public GamePlayerProxy(IGamePlayer _gameplayer) {
        this.gamePlayer = _gameplayer;
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
