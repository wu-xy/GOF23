package com.wzx.adapter;

/**
 * ������ģʽ
 * �ͻ��ˣ��ʼǱ�ֻ��USB�ӿڣ���Ҫʹ�ü���
 * ���̣��нӿڣ�������USB��
 * ��������һͷ��USB�ӿڣ�һͷ�Ǽ��̽ӿ�
 * @author Administrator
 *
 */
public class Test {
	
	public static void test1(Target target) {
		target.doSomething();
	}
	
	
	public static void main(String[] args) {
		Target target=new Adapter(new Adaptee());
		test1(target);
	}
}
