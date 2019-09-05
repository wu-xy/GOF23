package com.wzx.factory.factorymethod;

public class YasuoFactory implements HeoFactory {
	@Override
	public Hero Create() {
		
		return new Yasuo();
	}
}
