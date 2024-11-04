package com.tnsif.daythree.ConstructorDemo;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		System.out.println(" ");
		ConstructorDemo c1=new ConstructorDemo();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		ConstructorDemo c2=new ConstructorDemo(name, id, city);
		System.out.println(c2);
		sc.close();

	}

}
