package com.wzx.adapter;

/**
 * 适配器模式
 * 客户端：笔记本只有USB接口，想要使用键盘
 * 键盘：有接口，但不是USB型
 * 适配器：一头是USB接口，一头是键盘接口
 * @author Administrator
 *
 */
public class Test {
	
	public static void test1(Target target) {
		target.doSomething();
	}
	
	
	public static void main(String[] args) {
		Target target=new Adapter(new Adaptee());
		test1(target);
	}
}
