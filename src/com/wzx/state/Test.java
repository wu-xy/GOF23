package com.wzx.state;

/**
 * ״̬ģʽ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		HomeContext homeContext = new HomeContext();
		homeContext.setState(new FreeState());
		homeContext.setState(new BookedState());
	}
}
