package com.wzx.strategy;

public interface Strategy {
	double getPrice(double price);
}

class OldCustomerFew implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�����ۣ�ԭ��");
		return price;
	}
	
}
class NewCustomerFew implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�����");
		return price*0.9;
	}
	
}
class OldCustomerMany implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�������");
		return price*0.85;
	}
	
}
class NewCustomerMany implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("�����");
		return price*0.8;
	}
	
}
