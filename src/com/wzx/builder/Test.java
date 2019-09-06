package com.wzx.builder;

/**
 * 建造者模式
 * builder：构建者，负责制造零件
 * director:装配着，负责零件组装成实体
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		AirShip air=new AirShipDirector(new AirShipBuilder()).directorAirShip();
		System.out.println(air.getSafeSea().getName());
	}
}
