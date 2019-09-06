package com.wzx.adapter;

/**
 * 适配器，通过两个不同的接口，连接笔记本和键盘
 */
public class Adapter implements Target {
	
	private Adaptee adaptee;
	@Override
	public void doSomething() {
		
		adaptee.doSomething();
	}
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	

}
