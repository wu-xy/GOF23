package com.wzx.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ(���)
 * �¸��Ƹ����ԭ������û�й���
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		Date d=new Date(1234567899L);
		Sheep s1=new Sheep("����", d);
		Sheep s2=(Sheep)s1.clone1();
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());
		d.setYear(100);
		System.out.println(s1.getBirthday());
		
		
		s2.setName("����");
		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());
		
		
	}
	
	
	
}
