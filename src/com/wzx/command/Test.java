package com.wzx.command;

/**
 * ÃüÁîÄ£Ê½
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Command command=new CommandImpl(new Receiver());
		Publisher publisher = new Publisher(command);
		publisher.publish();
	}
}
