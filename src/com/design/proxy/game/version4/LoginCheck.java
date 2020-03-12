package com.design.proxy.game.version4;

public class LoginCheck implements ICheck<String,Boolean> {

    @Override
    public Boolean check(String token) {
        return token.isEmpty();
    }
}
