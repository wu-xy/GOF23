package com.wzx.mediator;

/**
 * 中介者模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Manager m=new Manager();
		DepartMent d1=new Developmnet(m);
		DepartMent d2=new Finance(m);
		DepartMent d3=new Market(m);
		
		d1.selfAction();
		d1.outAction();
		
	}
}	
