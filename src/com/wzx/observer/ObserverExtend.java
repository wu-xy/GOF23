package com.wzx.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ʹ��jdk�Դ���Observer�ӿ�ʵ�ֹ۲���ģʽ
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
