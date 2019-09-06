package com.wzx.builder;

/**
 * 装配者
 * 负责把零件组装成实体
 * @author Administrator
 *
 */

public class AirShipDirector {
	AirShipBuilder airShipBuilder;

	public AirShipDirector(AirShipBuilder airShipBuilder) {
		this.airShipBuilder = airShipBuilder;
	}
	
	public AirShip directorAirShip() {
		SafeSea safeSea = airShipBuilder.builderSafeSea();
		SpaceRoom spaceRoom = airShipBuilder.builderSpaceRoom();
		YinQing yinQing = airShipBuilder.builderYinQing();
		
		AirShip airShip=new AirShip();
		airShip.setSafeSea(safeSea);
		airShip.setSpaceRoom(spaceRoom);
		airShip.setYinQing(yinQing);
		
		return airShip;
		
	}
	
}
