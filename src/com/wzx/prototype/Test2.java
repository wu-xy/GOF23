package com.wzx.prototype;

import java.util.Date;

/**
 * 原型模式(深复制)
 * 新复制个体和原来个体没有关联
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		Date d=new Date(1234567899L);
		Sheep s1=new Sheep("少莉", d);
		Sheep s2=(Sheep)s1.clone1();
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
