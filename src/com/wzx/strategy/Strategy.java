package com.wzx.strategy;

public interface Strategy {
	double getPrice(double price);
}

class OldCustomerFew implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("不打折，原价");
		return price;
	}
	
}
class NewCustomerFew implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("打九折");
		return price*0.9;
	}
	
}
class OldCustomerMany implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("打八五折");
		return price*0.85;
	}
	
}
class NewCustomerMany implements Strategy{

	@Override
	public double getPrice(double price) {
		System.out.println("打八折");
		return price*0.8;
	}
	
}
