package com.wzx.chainOfResponsibility;

/**
 * ������ģʽ
 * ģ���������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Leader l1=new �鳤("����");
		Leader l2=new ����("����");
		Leader l3=new �ܾ���("����");
		//����쵼��ϵ��
		l1.setNextLeader(l2);
		l2.setNextLeader(l3);
		
		LeaveResquest leaveResquest=new LeaveResquest("xiaominng", "ȥ����", 5);
		l1.doHandler(leaveResquest);
	}
}
