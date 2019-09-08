package com.wzx.templateMethod;

public abstract class BankTemplateMethod {
	public void before() {
		System.out.println("�Һ��Ŷ�");
	}
	public void after() {
		System.out.println("��������");
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
		System.out.println("��Ҫ��Ǯ");
		
	}
	
}
class GetMoney extends BankTemplateMethod{

	@Override
	public void service() {
		System.out.println("��ҪȡǮ");
		
	}
	
}
