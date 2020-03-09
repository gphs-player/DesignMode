package com.design.strategy;

/**
 * Author   :   lihua
 * Date     :   2016/10/23.上午11:52
 * Description: 正常收费模式
 */
public class CashNormal extends CashSuper {
	@Override
	protected double acceptCash(double money) {
		return money;
	}
}
