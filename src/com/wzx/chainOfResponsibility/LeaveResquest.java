package com.wzx.chainOfResponsibility;

/**
 * ว๋ผูฬ๕
 * @author wzx
 *
 */
public class LeaveResquest {
	private String name;
	private String reason;
	private int day;
	
	public LeaveResquest(String name, String reason, int day) {
		super();
		this.name = name;
		this.reason = reason;
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "LeaveResquest [name=" + name + ", reason=" + reason + ", day=" + day + "]";
	}
	
	
}
