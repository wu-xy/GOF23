package com.wzx.factory.abstractfactory;

/**
 * ³éÏó¹¤³§
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		CarFactory c1=new HighCarFactory();
		LunTai luntai = c1.luntai();
		luntai.run();
		luntai.start();
		CarFactory c2=new LowCarFactory();
		LunTai luntai2 = c2.luntai();
		luntai2.run();
		luntai2.start();
		
	}
}
