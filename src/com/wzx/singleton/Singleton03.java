package com.wzx.singleton;

/**
 * 单例模式
 * 静态内部类
 * 把静态属性放在静态内部类中
 * @author Administrator
 *
 */
public class Singleton03 {
	private static class SingletonInstance{
		private static final Singleton03 instance=new Singleton03();
	} 

	private  Singleton03() {
		
	}
	//没有加锁，效率较高
	public static  Singleton03 getInstance() {	
				
		return SingletonInstance.instance;
	}

	
}
