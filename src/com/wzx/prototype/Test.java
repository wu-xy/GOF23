package com.wzx.prototype;

import java.util.Date;

/**
 * 原型模式(浅复制)
 * 克隆后属性指向同一个对象
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Date d=new Date(1234567899L);
		Sheep s1=new Sheep("少莉", d);
		Sheep s2=(Sheep)s1.clone();
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		d.setYear(100);
		System.out.println(s1.getBirthday());
		
		
		s2.setName("多莉");
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());
		
		
	}
	
	
	
}
