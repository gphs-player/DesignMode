package com.design.observe;

/**
 * Author   :   lihua
 * Date     :   16/9/26.下午5:33
 * Description:
 */
public class StockObserver extends Observer {

	protected String name;
	protected FirstSubject sub;

	public StockObserver(FirstSubject sub, String name) {
		this.name = name;
		this.sub = sub;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(FirstSubject sub) {
		this.sub = sub;
	}

	@Override
	protected void update() {
		System.out.println(sub.getmSubjectState() + ", 关闭股票, " + name);
	}
}
