package com.wzx.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ��̬����ģʽ
 * ��ʵ�����������ǣ�ֻ���𳪸������
 * ����������������������羭����
 * ��������Զ����ɣ������Լ�����
 * Ҫ����һ����������StarHandler����ʵ��InvocationHandler�ӿ�
 * Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler)
 * ���봦������ͨ���Դ��ķ������ɴ������
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
