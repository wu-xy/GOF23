package com.wzx.builder;

/**
 * ������ģʽ
 * builder�������ߣ������������
 * director:װ���ţ����������װ��ʵ��
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		AirShip air=new AirShipDirector(new AirShipBuilder()).directorAirShip();
		System.out.println(air.getSafeSea().getName());
	}
}
