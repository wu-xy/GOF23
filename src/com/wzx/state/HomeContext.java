package com.wzx.state;

/**
 * �������
 * @author Administrator
 *
 */
public class HomeContext {
	private State state;

	public void setState(State state) {
		System.out.println("����״̬�Ѹ���");
		this.state = state;
		state.handle();
	}
	
}
