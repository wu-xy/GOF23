package com.wzx.factory.abstractfactory;

public class HighYinQingImp implements YiQing {

	@Override
	public void run() {
		System.out.println("跑得快");
	}

	@Override
	public void start() {
		System.out.println("启动快");
	}

}
