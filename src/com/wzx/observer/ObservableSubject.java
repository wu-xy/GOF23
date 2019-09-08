package com.wzx.observer;

import java.util.Observable;

/**
 * 被观察对象
 * @author Administrator
 *
 */
public class ObservableSubject extends Observable {
	int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		setChanged();		//标记状态改变
		notifyObservers();	//通知观察者状态发生了改变
	}
	
}
