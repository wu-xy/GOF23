package com.wzx.singleton;

/**
 * ����ģʽ
 * ��̬�ڲ���
 * �Ѿ�̬���Է��ھ�̬�ڲ�����
 * @author Administrator
 *
 */
public class Singleton03 {
	private static class SingletonInstance{
		private static final Singleton03 instance=new Singleton03();
	} 

	private  Singleton03() {
		
	}
	//û�м�����Ч�ʽϸ�
	public static  Singleton03 getInstance() {	
				
		return SingletonInstance.instance;
	}

	
}
