package com.design.factory_method;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午2:28
 * Description:	操作类,获取两个数的结果
 */
public abstract class Operation {

	protected int x;
	protected int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract int getResult();
}
