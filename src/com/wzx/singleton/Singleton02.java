package com.wzx.singleton;

/**
 * ����ģʽ
 * ����ʽ
 * ֻ��ʹ�õ�ʱ��Ż�ȥnewһ������
 * ��ȡ�����������Ч�ʽ϶�����
 * @author Administrator
 *
 */
public class Singleton02 {
	private static Singleton02 instance;

	private  Singleton02() {
		
	}

	public static synchronized Singleton02 getInstance() {	//���������ֹ�����߳�ͬʱ���ã�����������ʵ��
		if (instance==null) {
			instance=new Singleton02();
		}
		
		return instance;
	}

	
}
