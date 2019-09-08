package com.wzx.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用jdk自带的Observer接口实现观察者模式
 * @author Administrator
 *
 */
public class ObserverExtend implements Observer {
	int state;
	@Override
	public void update(Observable o, Object arg) {
		state=((ObservableSubject)o).getState();
		
	}
	
	public int getMyState() {		
		return state;
	}
}
