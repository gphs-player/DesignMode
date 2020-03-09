package com.design.proxy;

/**
 * Author:lihua
 * Date:2016/12/23
 * Description:
 */
public class Panjinlian implements Women {
    @Override
    public void throwEye(String someOne) {
        System.out.println("小潘多看了" + someOne + "一眼");
    }

    @Override
    public void doSomething(String money) {
        System.out.println("小潘还想要和" + money + "。。。");
    }
}
