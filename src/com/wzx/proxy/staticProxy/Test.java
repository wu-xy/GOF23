package com.wzx.proxy.staticProxy;

/**
 * ��̬����ģʽ
 * ��ʵ�����������ǣ�ֻ���𳪸������
 * ����������������������羭����
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		RealStar realStar=new RealStar();
		ProxyStar proxyStar= new ProxyStar(realStar);
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTickct();
		proxyStar.sing();
	}
}
