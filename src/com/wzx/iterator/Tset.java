package com.wzx.iterator;

/**
 * ����ģʽ
 * �ο����Ͽ���еĵ�����
 * @author Administrator
 *
 */
public class Tset {
	public static void main(String[] args) {
		Mylist mylist = new Mylist();
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		
		MyIterator myIterator = mylist.createMyIterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next()); 			
		}
		
	}
}
