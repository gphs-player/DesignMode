package com.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Author   :   lihua
 * Date     :   16/9/27.上午9:38
 * Description:
 */
public abstract class Subject {

	private static List<Observer> mObservers = new ArrayList();

	/**
	 * @param observer 增加观察者
	 */
	public void attach(Observer observer) {
		if (observer != null) {
			mObservers.add(observer);
		}
	}

	/**
	 * @param observer 移除观察者
	 */
	public void detach(Observer observer) {
		if (observer != null && mObservers.contains(observer)) {
			mObservers.remove(observer);
		}
	}

	/**
	 * 刷新所有
	 */
	public void notifyObserver() {
		for (Observer mObserver : mObservers) {
			mObserver.update();
		}
	}
}
