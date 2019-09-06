package com.wzx.proxy.staticProxy;

public class ProxyStar implements Star {
	RealStar realStar;
	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar面谈");

	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar签合同");

	}

	@Override
	public void bookTickct() {
		System.out.println("ProxyStar订机票");

	}

	@Override
	public void sing() {
		realStar.sing();

	}
	

}
