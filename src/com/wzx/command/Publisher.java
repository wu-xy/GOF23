package com.wzx.command;

/**
 * �������
 * @author Administrator
 *
 */
public class Publisher {
	Command command;

	public Publisher(Command command) {
		super();
		this.command = command;
	}
	
	public void publish() {
		System.out.println("��������");
		command.execute();
	}
	
}
