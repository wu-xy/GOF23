package com.wzx.iterator;

/**
 * 迭代模式
 * 参考集合框架中的迭代器
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
