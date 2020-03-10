package com.design.proxy.demo;

/**
 * Author:lihua
 * Date:2017/7/19
 * Description:
 */
public class CompanyA implements ProductOutput {
    @Override
    public void outPutSth() {
        System.out.println("正版老中医产品");
    }
}
