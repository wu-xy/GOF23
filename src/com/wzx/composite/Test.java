package com.wzx.composite;

/**
 * ���ģʽ
 * ����һ����������ӿ�
 * Ҷ����������������ʵ������ӿ�
 * �����������Ҷ�����
 * @author Administrator
 *
 */
public class Test {
			
	public static void main(String[] args) {
		Floder f1=new Floder("�ҵ��ղ�");
		AbstractComponent f2=new InmageFloder("ͼƬ.jpg");
		AbstractComponent f3=new TxtFloder("�ı�.TXT");
		AbstractComponent f4=new VideoFloder("��Ƶ.mp4");
		f1.add(f2);
		f1.add(f3);
		f1.add(f4);
		
		Floder f11=new Floder("�ҵ���Ƶ");
		AbstractComponent f5=new VideoFloder("��Ƶ1.mp4");
		AbstractComponent f6=new VideoFloder("��Ƶ2.mp4");
		f11.add(f5);
		f11.add(f6);
		f1.add(f11);
		
		f1.killVirus();
		f2.killVirus();
		
	}
}
