package com.wzx.chainOfResponsibility;

/**
 * ������
 * �쵼
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

class �鳤 extends Leader{

	public �鳤(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<3) {
			System.out.println(leaveResquest);
			System.out.println("�鳤"+name+":��׼����");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
		}
		
	}
	
}

class ���� extends Leader{

	public ����(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<10) {
			System.out.println(leaveResquest);
			System.out.println("����"+name+":��׼����");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
		}
		
	}
	
}

class �ܾ��� extends Leader{

	public �ܾ���(String name) {
		super(name);
	}
	@Override
	public void doHandler(LeaveResquest leaveResquest) {
		if(leaveResquest.getDay()<30) {
			System.out.println(leaveResquest);
			System.out.println("�ܾ���"+name+":��׼����");
		}else {
			if(nextLeader!=null) {
				nextLeader.doHandler(leaveResquest);
			}
			System.out.println("����׼");
		}
		
	}
	
}

