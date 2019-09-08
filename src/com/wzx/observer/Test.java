package com.wzx.observer;

/**
 * 观察者模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Observer ob1=new ObserverImpl();
		Observer ob2=new ObserverImpl();
		Observer ob3=new ObserverImpl();
				
		SubjectImpl subjectImpl = new SubjectImpl();
		subjectImpl.register(ob1);		//给被观察对象添加观察者
		subjectImpl.register(ob2);
		subjectImpl.register(ob3);
				
		subjectImpl.setState(100);	//给被观察对象状态改变，观察者观察到变化
		System.out.println(ob1.getMyState());
		System.out.println(ob2.getMyState());
		System.out.println(ob3.getMyState());
		
		subjectImpl.setState(200);
		System.out.println("-------------");
		System.out.println(ob1.getMyState());
		System.out.println(ob2.getMyState());
		System.out.println(ob3.getMyState());
	}
}
