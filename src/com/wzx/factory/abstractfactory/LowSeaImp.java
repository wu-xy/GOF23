package com.wzx.factory.abstractfactory;

public class LowSeaImp implements Sea {

	@Override
	public void price() {
		System.out.println("����");
	}

	@Override
	public void cosy() {
		System.out.println("����һ��");
	}

}
