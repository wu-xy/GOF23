package com.wzx.proxy.staticProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar��̸");

	}

	@Override
	public void signContract() {
		System.out.println("RealStarǩ��ͬ");

	}

	@Override
	public void bookTickct() {
		System.out.println("RealStar����Ʊ");

	}

	@Override
	public void sing() {
		System.out.println("RealStar����");

	}

}
