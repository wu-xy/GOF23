package com.wzx.factory.abstractfactory;

public class HighLunTaiImp implements LunTai {

	@Override
	public void run() {
		
		System.out.println("高级轮胎");
	}

	@Override
	public void start() {
		System.out.println("转得快");

	}

}
