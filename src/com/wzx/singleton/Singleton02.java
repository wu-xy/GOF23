package com.wzx.singleton;

/**
 * 单例模式
 * 懒汉式
 * 只有使用的时候才会去new一个对象
 * 获取方法需加锁，效率较饿汉低
 * @author Administrator
 *
 */
public class Singleton02 {
	private static Singleton02 instance;

	private  Singleton02() {
		
	}

	public static synchronized Singleton02 getInstance() {	//需加锁，防止两个线程同时调用，创建了两个实例
		if (instance==null) {
			instance=new Singleton02();
		}
		
		return instance;
	}

	
}
