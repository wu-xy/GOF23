package com.wzx.builder;

/**
 * �����ߣ������������
 * @author Administrator
 *
 */
public class AirShipBuilder {
	
	YinQing builderYinQing() {
		return new YinQing("����");
		
	}
	SpaceRoom builderSpaceRoom() {
		return new SpaceRoom("̫�ղ�");
		
	}
	SafeSea builderSafeSea() {
		return new SafeSea("��ȫ��");
		
	}
}
