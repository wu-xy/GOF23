package com.wzx.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable,Serializable {
	String name;
	Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Sheep(String name, Date birthday) {		
		this.name = name;
		this.birthday = birthday;
	}
	public Sheep() {		
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object obj=super.clone();		
		
		return obj;
	}

	protected Object clone1() throws CloneNotSupportedException {
		
		Object obj=super.clone();
		Sheep s=(Sheep)obj;
		s.birthday=(Date)this.birthday.clone();
		
		return obj;
	}
	
}
