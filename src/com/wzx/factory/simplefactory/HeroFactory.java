package com.wzx.factory.simplefactory;

/**
 * ��̬����
 * @author Administrator
 *
 */
public class HeroFactory {
	public static Hero createGailun() {
		return new Gailun();
		
	}
	public static Hero createYasuo() {
		return new Yasuo();
		
	}
}
