package com.wzx.factory.abstractfactory;

public class LowCarFactory implements CarFactory {

	@Override
	public LunTai luntai() {
		
		return new LowLunTaiImp();
	}

	@Override
	public YiQing yinqing() {		
		return new LowYinQingImp();
	}

	@Override
	public Sea zuoyi() {
		return new LowSeaImp();
	}

	

}
