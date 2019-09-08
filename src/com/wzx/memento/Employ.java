package com.wzx.memento;

public class Employ {
	private String name;
	private int age;
	private double salary;
	public Employ(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public EmpMemento getEmpMemento() {			//得到备份对象
		return new EmpMemento(this);
		
	}
	
	public void recover(EmpMemento empMemento) {	//恢复到备份前
		this.name = empMemento.getName();
		this.age = empMemento.getAge();
		this.salary = empMemento.getSalary();
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
