package com.wzx.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
	void notifyAl();
}

class SubjectImpl implements Subject{
	List<Observer> list=new ArrayList<Observer>();
	int state;
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAl();
	}

	@Override
	public void notifyAl() {
		for (Observer observer : list) {
			observer.setMyState(state);
		}
		
	}
	
	public void register(Observer ob) {
		list.add(ob);
	}
	public void remove(Observer ob) {
		list.remove(ob);
	}
	
	
}