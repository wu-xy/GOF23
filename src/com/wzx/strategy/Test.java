package com.wzx.strategy;

/**
 * ����ģʽ
 * �㷨���룬ѡ��ʵ��
 * @author wzx
 *
 */
public class Test {
	public static void main(String[] args) {
		Strategy s1=new OldCustomerMany();
		Context context = new Context(s1);
		context.price(100);
	}
}
