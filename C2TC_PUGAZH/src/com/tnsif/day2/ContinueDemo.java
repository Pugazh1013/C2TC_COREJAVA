package com.tnsif.day2;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
		}
		for(int i=1;i<=20;i++) {
			if(i%2!=0)
				continue;
			System.out.println(i);
		}


	}

}
