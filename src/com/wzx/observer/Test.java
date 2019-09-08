package com.wzx.observer;

/**
 * �۲���ģʽ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Observer ob1=new ObserverImpl();
		Observer ob2=new ObserverImpl();
		Observer ob3=new ObserverImpl();
				
		SubjectImpl subjectImpl = new SubjectImpl();
		subjectImpl.register(ob1);		//�����۲������ӹ۲���
		subjectImpl.register(ob2);
		subjectImpl.register(ob3);
				
		subjectImpl.setState(100);	//�����۲����״̬�ı䣬�۲��߹۲쵽�仯
		System.out.println(ob1.getMyState());
		System.out.println(ob2.getMyState());
		System.out.println(ob3.getMyState());
		
		subjectImpl.setState(200);
		System.out.println("-------------");
		System.out.println(ob1.getMyState());
		System.out.println(ob2.getMyState());
		System.out.println(ob3.getMyState());
		
		System.out.println("-------------ʹ��ϵͳ�Դ��ӿ�ʵ�ֹ۲���ģʽ");
		ObserverExtend observer1 = new ObserverExtend();
		ObserverExtend observer2 = new ObserverExtend();
		ObserverExtend observer3 = new ObserverExtend();
		
		ObservableSubject subject = new ObservableSubject();
		subject.addObserver(observer1);			//�����۲������ӹ۲���
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		
		subject.setState(200);
		System.out.println(observer1.getMyState());
		System.out.println(observer2.getMyState());
		System.out.println(observer3.getMyState());
	}
}
