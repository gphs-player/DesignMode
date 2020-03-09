package com.design.strategy;

/**
 * Author   :   lihua
 * Date     :   2016/10/23.下午12:01
 * Description: 返利收费
 */
public class CashReturn extends CashSuper {

	private double mCashCondition = 0;
	private double mCashReturn = 0;

	public CashReturn(double cashCondition, double cashReturn) {
		this.mCashCondition = cashCondition;
		this.mCashReturn = cashReturn;
	}

	@Override
	protected double acceptCash(double money) {
		if (money >= mCashCondition) {
			return money - Math.floor(money / mCashCondition) * mCashReturn;
		}
		return money;
	}
}
