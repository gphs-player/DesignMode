package com.design.proxy.demo;

/**
 * Author:lihua
 * Date:2017/7/19
 * Description:
 */
public class Store implements ProductOutput {


    private ProductOutput mProxy;

    public Store(ProductOutput proxy) {
        this.mProxy = proxy;
    }

    @Override
    public void outPutSth() {
        System.out.println("我是代理商，代理商的产品是");
        mProxy.outPutSth();
    }
}
