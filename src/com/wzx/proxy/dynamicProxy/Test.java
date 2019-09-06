package com.wzx.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理模式
 * 真实对象，例如明星，只负责唱歌就行了
 * 其他工作交给代理对象，例如经纪人
 * 代理对象自动生成，不用自己创建
 * 要创建一个处理器（StarHandler），实现InvocationHandler接口
 * Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler)
 * 传入处理器，通过自带的方法生成代理对象
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Star realStar=new RealStar();
		StarHandler starHandler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
		
		proxy.sing();
	}
}
