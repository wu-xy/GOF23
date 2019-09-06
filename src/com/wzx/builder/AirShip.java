package com.wzx.builder;

public class AirShip {
	YinQing yinQing;		//引擎
	SpaceRoom spaceRoom;	//太空舱
	SafeSea safeSea;		//安全座椅
	
	
	public YinQing getYinQing() {
		return yinQing;
	}
	public void setYinQing(YinQing yinQing) {
		this.yinQing = yinQing;
	}
	public SpaceRoom getSpaceRoom() {
		return spaceRoom;
	}
	public void setSpaceRoom(SpaceRoom spaceRoom) {
		this.spaceRoom = spaceRoom;
	}
	public SafeSea getSafeSea() {
		return safeSea;
	}
	public void setSafeSea(SafeSea safeSea) {
		this.safeSea = safeSea;
	}			
	
}
class YinQing{
	String name;
	
	public YinQing(String name) {
		System.out.println("正在建造引擎");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class SpaceRoom{
	String name;
	
	public SpaceRoom(String name) {
		System.out.println("正在建造太空舱");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class SafeSea{
	String name;
	
	public SafeSea(String name) {
		System.out.println("正在建造安全椅");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


