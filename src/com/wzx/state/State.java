package com.wzx.state;

public interface State {
	/**
	 * 状态行为
	 */
	void handle();		
}

class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("房间空闲，可入住");
		
	}
	
}
class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预订");
		
	}
	
}
class CheckInState implements State{

	@Override
	public void handle() {
		System.out.println("房间已被入住");
		
	}
	
}