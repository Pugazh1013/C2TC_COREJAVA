package com.tnsif.daythree.EncapsulationDemo;

public class OopsDemo {
	private int SerialNum;
	private String Name;
	private int Age;
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "OopsDemo [SerialNum=" + SerialNum + ", Name=" + Name + ", Age=" + Age + "]";
	}
	

}
