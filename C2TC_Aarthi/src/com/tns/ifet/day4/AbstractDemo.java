package com.tns.ifet.day4;

public abstract class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		System.out.println("------------------------------------------------");	
		Shape shape;
		shape=new Square(12.5f);		
		shape.calArea();
		shape.show();		
		shape=new Rectangle(10,20);
		shape.calArea();
		shape.show();
	}

}