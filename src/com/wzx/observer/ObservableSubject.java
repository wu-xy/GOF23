package com.wzx.observer;

import java.util.Observable;

/**
 * ���۲����
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
		setChanged();		//���״̬�ı�
		notifyObservers();	//֪ͨ�۲���״̬�����˸ı�
	}
	
}
