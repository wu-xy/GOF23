package com.wzx.mediator;

/**
 * ���Žӿ�
 * @author Administrator
 *
 */
public interface DepartMent {
	void selfAction();
	void outAction();
}

class Developmnet implements DepartMent{
	
	Manager m;
		
	public Developmnet(Manager m) {
		super();
		this.m = m;
		m.register("Developmnet", this);
	}

	@Override
	public void selfAction() {
		System.out.println("�з���Ŀ");
		
	}

	@Override
	public void outAction() {
		System.out.println("�з�������Ҫ�ʽ�");
		m.command("Finance");
	}
	
}
class Market implements DepartMent{
	
	Manager m;
		
	public Market(Manager m) {
		super();
		this.m = m;
		m.register("Market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("����Ŀ��Ŀ");
		
	}

	@Override
	public void outAction() {
		System.out.println("�г�������ҪǮ");
		m.command("Finance");
	}
	
}
class Finance implements DepartMent{
	
	Manager m;
		
	public Finance(Manager m) {
		super();
		this.m = m;
		m.register("Finance", this);
	}

	@Override
	public void selfAction() {
		System.out.println("��Ǯ");
		
	}

	@Override
	public void outAction() {
		System.out.println("���񲿣�ҪǮ����˵");		
	}
	
}


