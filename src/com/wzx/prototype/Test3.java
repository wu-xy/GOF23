package com.wzx.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式(深复制)
 * 使用系列化和反系列化实现深克隆
 * 新复制个体和原来个体没有关联
 * @author Administrator
 *
 */
public class Test3 {
	public static void main(String[] args) throws Exception {
		Date d=new Date(1234567899L);
		Sheep s1=new Sheep("少莉", d);
						
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);				
		byte[] bytes=bos.toByteArray();
						
		ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
		ObjectInputStream ois =new ObjectInputStream(bis);
		Sheep s2 = (Sheep)ois.readObject();
		
		
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
