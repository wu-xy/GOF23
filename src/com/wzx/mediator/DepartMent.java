package com.wzx.mediator;

/**
 * 部门接口
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
		System.out.println("研发项目");
		
	}

	@Override
	public void outAction() {
		System.out.println("研发部：需要资金");
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
		System.out.println("接项目项目");
		
	}

	@Override
	public void outAction() {
		System.out.println("市场部：需要钱");
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
		System.out.println("管钱");
		
	}

	@Override
	public void outAction() {
		System.out.println("财务部：要钱跟我说");		
	}
	
}


