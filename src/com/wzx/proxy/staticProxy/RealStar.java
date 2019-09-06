package com.wzx.proxy.staticProxy;

public class RealStar implements Star {

	@Override
	public void confer() {
		System.out.println("RealStar面谈");

	}

	@Override
	public void signContract() {
		System.out.println("RealStar签合同");

	}

	@Override
	public void bookTickct() {
		System.out.println("RealStar订机票");

	}

	@Override
	public void sing() {
		System.out.println("RealStar唱歌");

	}

}
