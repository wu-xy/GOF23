package com.wzx.factory.factorymethod;

public class GailunFactory implements HeoFactory {
	@Override
	public Hero Create() {		
		return new Gailun();
	}
}
