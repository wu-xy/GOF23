package com.wzx.factory.factorymethod;

/**
 * ��������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Hero a=new GailunFactory().Create();
		Hero b=new YasuoFactory().Create();
		a.kill();
		b.kill();
	}
}
