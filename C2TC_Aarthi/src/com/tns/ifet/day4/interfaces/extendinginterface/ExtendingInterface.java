package com.tns.ifet.day4.interfaces.extendinginterface;

public class ExtendingInterface implements ChildInterface {
	public void print() { 
		System.out.println("print method");
	}

	// Override ChildInterface method
	public void show() {
		System.out.println("show Method");
	}
}
