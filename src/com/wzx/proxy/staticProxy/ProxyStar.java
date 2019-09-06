package com.wzx.proxy.staticProxy;

public class ProxyStar implements Star {
	RealStar realStar;
	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar��̸");

	}

	@Override
	public void signContract() {
		System.out.println("ProxyStarǩ��ͬ");

	}

	@Override
	public void bookTickct() {
		System.out.println("ProxyStar����Ʊ");

	}

	@Override
	public void sing() {
		realStar.sing();

	}
	

}
