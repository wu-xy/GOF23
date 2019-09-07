package com.wzx.chainOfResponsibility;

/**
 * 抽象类
 * 领导
 * @author Administrator
 *
 */
public abstract class Leader {
	String name;
	Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Leader getNextLeader() {
		return nextLeader;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void doHandler(LeaveResquest leaveResquest);
	
}

class 组长 extends Leader{

	public 组长(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<3) {
			System.out.println(leaveResquest);
			System.out.println("组长"+name+":批准请求");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
		}
		
	}
	
}

class 经理 extends Leader{

	public 经理(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<10) {
			System.out.println(leaveResquest);
			System.out.println("经理"+name+":批准请求");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
		}
		
	}
	
}

class 总经理 extends Leader{

	public 总经理(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<30) {
			System.out.println(leaveResquest);
			System.out.println("总经理"+name+":批准请求");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
			System.out.println("不批准");
		}
		
	}
	
}

