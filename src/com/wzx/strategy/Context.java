package com.wzx.strategy;

/**
 * 负责调用算法
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
		System.out.println("原价为："+price);
		System.out.println("实际价格为："+strategy.getPrice(price));
	} 
	
}
