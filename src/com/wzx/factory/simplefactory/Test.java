package com.wzx.factory.simplefactory;

/**
 * ��̬����
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Hero a=HeroFactory.createGailun();
		Hero b=HeroFactory.createYasuo();
		a.kill();
		b.kill();
	}
}
