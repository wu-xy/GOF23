package com.wzx.memento;

/**
 * ����¼ģʽ
 * ���б��ݺͻָ�����
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		MementoManage mementoManage = new MementoManage();
		Employ employ = new Employ("����", 18, 300);
		mementoManage.setEmpMemento(employ.getEmpMemento()); //���б���
		System.out.println("�޸�ǰ");
		System.out.println(employ);
		
		employ.setName("����");
		employ.setAge(20);
		employ.setSalary(500);
		System.out.println("�޸ĺ�");
		System.out.println(employ);
		
		employ.recover(mementoManage.getEmpMemento());
		System.out.println("�ָ�Ϊ");
		System.out.println(employ);
	}
}
