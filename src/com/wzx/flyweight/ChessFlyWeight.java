package com.wzx.flyweight;

public interface ChessFlyWeight {
	void setColor(String color);
	String getColor();
	void dsiplay(Position position);
}

class Chess implements ChessFlyWeight{
	String color;
		
	public Chess(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void dsiplay(Position position) {
		System.out.println("������ɫΪ��"+color);
		System.out.println("����λ��Ϊ:"+position.getX()+"---"+position.getY());
		
	}
	
}