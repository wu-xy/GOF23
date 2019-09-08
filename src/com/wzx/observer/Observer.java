package com.wzx.observer;

public interface Observer {
	int getMyState();
	void setMyState(int state);
}
class ObserverImpl implements Observer{
	int state;
	@Override
	public int getMyState() {		
		return state;
	}
	
	public void setMyState(int state) {
		this.state=state;
	}
	
}
