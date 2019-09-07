package com.wzx.chainOfResponsibility;

/**
 * 责任链模式
 * 模拟请假流程
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Leader l1=new 组长("张三");
		Leader l2=new 经理("李四");
		Leader l3=new 总经理("王五");
		//组合领导关系链
		l1.setNextLeader(l2);
		l2.setNextLeader(l3);
		
		LeaveResquest leaveResquest=new LeaveResquest("xiaominng", "去旅游", 5);
		l1.doHandler(leaveResquest);
	}
}
