package com.wzx.adapter;

/**
 * ��������ͨ��������ͬ�Ľӿڣ����ӱʼǱ��ͼ���
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
