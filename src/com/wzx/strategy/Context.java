package com.wzx.strategy;

/**
 * ��������㷨
 * @author wzx
 *
 */
public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void price(double price) {
		System.out.println("ԭ��Ϊ��"+price);
		System.out.println("ʵ�ʼ۸�Ϊ��"+strategy.getPrice(price));
	} 
	
}
