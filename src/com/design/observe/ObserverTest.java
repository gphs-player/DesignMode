package com.design.observe;

/**
 * Author   :   lihua
 * Date     :   16/9/27.上午9:48
 * Description: 观察者模式
 */
public class ObserverTest {
	public static void main(String[] args) {
		FirstSubject firstSubject = new FirstSubject();
		firstSubject.attach(new StockObserver(firstSubject,"paul"));
		firstSubject.attach(new StockObserver(firstSubject,"george"));
		firstSubject.attach(new StockObserver(firstSubject,"duncan"));
		firstSubject.setmSubjectState("test");
		firstSubject.notifyObserver();
	}
}
