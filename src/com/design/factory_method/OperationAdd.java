package com.design.factory_method;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午2:34
 * Description:加法操作
 */
public class OperationAdd extends Operation {
	@Override
	public int getResult() {
		return x + y;
	}
}
