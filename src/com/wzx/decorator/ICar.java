package com.wzx.decorator;

/**
 * �������
 * @author wzx
 *
 */
public interface ICar {
	void move();
}

class Car implements ICar{

	@Override
	public void move() {
		System.out.println("������");
		
	}
			
}

class SuperCar implements ICar{	
	ICar car;		
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
		
	}
			
}

class FlyCar extends SuperCar{			
	public FlyCar(ICar car) {
		super(car);		
	}
	@Override
	public void move() {
		car.move();
		fly();
	}
	public void fly() {
		System.out.println("���Ϸ�");		
	}	
}

class WaterCar extends SuperCar{	
	public WaterCar(ICar car) {
		super(car);
	}
	@Override
	public void move() {
		car.move();
		water();
	}
	public void water() {
		System.out.println("ˮ����");		
	}	
}

class AICar extends SuperCar{			
	public AICar(ICar car) {
		super(car);		
	}
	@Override
	public void move() {
		car.move();
		auto();
	}
	public void auto() {
		System.out.println("�Զ���");		
	}	
}



