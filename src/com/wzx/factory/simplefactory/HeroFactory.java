package com.wzx.factory.simplefactory;

/**
 * ¾²Ì¬¹¤³§
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
