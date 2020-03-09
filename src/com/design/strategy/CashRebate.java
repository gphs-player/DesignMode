package com.design.strategy;

/**
 * Author   :   lihua
 * Date     :   2016/10/23.上午11:54
 * Description: 打折收费
 */
public class CashRebate extends CashSuper {

	private double mRebate;

	public CashRebate(double rebate) {
		this.mRebate = rebate;
	}

	@Override
	protected double acceptCash(double money) {
		return mRebate * money;
	}
}
