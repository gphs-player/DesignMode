package com.design.proxy;

/**
 * Author:lihua
 * Date:2016/12/23
 * Description:
 */
public class WangPo implements Women {
    private final Women women;

    public WangPo(Women women) {
        this.women = women;
    }

    @Override
    public void throwEye(String money) {
        women.throwEye(money);
    }

    @Override
    public void doSomething(String money) {
        women.doSomething(money);
    }
}
