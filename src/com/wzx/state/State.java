package com.wzx.state;

public interface State {
	/**
	 * ״̬��Ϊ
	 */
	void handle();		
}

class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("������У�����ס");
		
	}
	
}
class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("������Ԥ��");
		
	}
	
}
class CheckInState implements State{

	@Override
	public void handle() {
		System.out.println("�����ѱ���ס");
		
	}
	
}