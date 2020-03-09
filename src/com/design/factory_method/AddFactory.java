package com.design.factory_method;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午2:33
 * Description:
 */
public class AddFactory implements IFactory {
	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
