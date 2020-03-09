package com.design.strategy;

/**
 * Author   :   lihua
 * Date     :   2016/10/23.上午11:51
 * Description: 收费父类
 */
public abstract class CashSuper {
    /**
     * @param money 接收用户选择商品的总金额
     * @return 返回用户实际需要消费
     */
    protected abstract double acceptCash(double money);
}
