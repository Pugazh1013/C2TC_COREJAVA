package com.tns.ifet.day4;

public abstract class Shape {
	protected float area;
    
    //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }

}
