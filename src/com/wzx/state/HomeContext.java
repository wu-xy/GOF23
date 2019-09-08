package com.wzx.state;

/**
 * 房间对象
 * @author Administrator
 *
 */
public class HomeContext {
	private State state;

	public void setState(State state) {
		System.out.println("房间状态已更改");
		this.state = state;
		state.handle();
	}
	
}
