package com.design.factory;

/**
 * Author   :   lihua
 * Date     :   2016/10/20.下午4:30
 * Description: 除法操作类
 */
public class OperateDiv extends Operate {
	@Override
	public float getResult() {
		if (mNumberB == 0) {
			throw new IllegalArgumentException("被除数不能为0,SB");
		}
		return mNumberA * mNumberB;
	}
}
