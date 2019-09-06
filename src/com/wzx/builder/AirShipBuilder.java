package com.wzx.builder;

/**
 * 构建者，负责制造零件
 * @author Administrator
 *
 */
public class AirShipBuilder {
	
	YinQing builderYinQing() {
		return new YinQing("引擎");
		
	}
	SpaceRoom builderSpaceRoom() {
		return new SpaceRoom("太空舱");
		
	}
	SafeSea builderSafeSea() {
		return new SafeSea("安全椅");
		
	}
}
