package com.wzx.factory.abstractfactory;

public class HighCarFactory implements CarFactory {

	@Override
	public LunTai luntai() {
		
		return new HighLunTaiImp();
	}

	@Override
	public YiQing yinqing() {		
		return new HighYinQingImp();
	}

	@Override
	public Sea zuoyi() {
		return new HighSeaImp();
	}

	

}
