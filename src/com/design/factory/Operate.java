package com.design.factory;

/**
 * Author: niubao
 * Date: 16/6/2-下午3:03
 * Description:简单工厂模式的超类
 */
public abstract class Operate {
	public float mNumberA;
	public float mNumberB;

	/**
	 * 业务只有一个,获取两个数的"结果",逻辑不管,在子类进行实现
	 *
	 * @return
	 */
	public abstract float getResult();
}
