package com.wzx.singleton;

/**
 * ����ģʽ
 * ����ʽ
 * �����Ƿ�ʹ�ö���newһ������
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
