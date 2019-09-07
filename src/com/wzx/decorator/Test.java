package com.wzx.decorator;

/**
 * װ��ģʽ
 * װ������ԭ���������ӹ���
 * @author wzx
 *
 */
public class Test {
			
	public static void main(String[] args) {
		ICar car=new Car();
		car.move();
		System.out.println("----------");
		ICar fLyCar=new FlyCar(car);
		fLyCar.move();
		System.out.println("----------");
		WaterCar waterCar = new WaterCar(fLyCar);
		waterCar.move();
		System.out.println("----------");
		AICar aiCar = new AICar(waterCar);
		aiCar.move();
		
	}
}
