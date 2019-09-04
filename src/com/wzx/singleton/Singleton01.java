package com.wzx.singleton;

/**
 * 单例模式
 * 饿汉式
 * 无论是否使用都会new一个对象
 * @author Administrator
 *
 */
public class Singleton01 {
	private static Singleton01 instance=new Singleton01();

	private  Singleton01() {
		
	}

	public static Singleton01 getInstance() {
		return instance;
	}

	
}
