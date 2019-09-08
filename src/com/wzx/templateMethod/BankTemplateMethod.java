package com.wzx.templateMethod;

public abstract class BankTemplateMethod {
	public void before() {
		System.out.println("挂号排队");
	}
	public void after() {
		System.out.println("服务评分");
	}
	
	public abstract void service();
	
	public void process() {
		this.before();
		this.service();
		this.after();
		
	}
			
}

class SaveMoney extends BankTemplateMethod{

	@Override
	public void service() {
		System.out.println("我要存钱");
		
	}
	
}
class GetMoney extends BankTemplateMethod{

	@Override
	public void service() {
		System.out.println("我要取钱");
		
	}
	
}
