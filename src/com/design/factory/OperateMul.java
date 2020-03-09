package com.design.factory;

/**
 * Author   :   lihua
 * Date     :   2016/10/20.下午4:30
 * Description: 乘法操作类
 */
public class OperateMul extends Operate {
	@Override
	public float getResult() {
		return mNumberA * mNumberB;
	}
}
