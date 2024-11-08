package com.tns.ifet.day4.iterfaces.functionalinterfaces;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {return "Good Afternoon";};
		

		System.out.println(g1.greet());

	}

}
