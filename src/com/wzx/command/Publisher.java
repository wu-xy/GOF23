package com.wzx.command;

/**
 * 命令发布者
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
		System.out.println("发布命令");
		command.execute();
	}
	
}
