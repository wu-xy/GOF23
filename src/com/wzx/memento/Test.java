package com.wzx.memento;

/**
 * 备忘录模式
 * 进行备份和恢复操作
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		MementoManage mementoManage = new MementoManage();
		Employ employ = new Employ("盖伦", 18, 300);
		mementoManage.setEmpMemento(employ.getEmpMemento()); //进行备份
		System.out.println("修改前");
		System.out.println(employ);
		
		employ.setName("亚索");
		employ.setAge(20);
		employ.setSalary(500);
		System.out.println("修改后");
		System.out.println(employ);
		
		employ.recover(mementoManage.getEmpMemento());
		System.out.println("恢复为");
		System.out.println(employ);
	}
}
