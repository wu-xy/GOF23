package com.wzx.strategy;

/**
 * 策略模式
 * 算法分离，选择实现
 * @author wzx
 *
 */
public class Test {
	public static void main(String[] args) {
		Strategy s1=new OldCustomerMany();
		Context context = new Context(s1);
		context.price(100);
	}
}
