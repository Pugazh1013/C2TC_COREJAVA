package com.tns.ifet.day11.uncheckedexception;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		try {
			x = new int[] { 1, 2, 3, 4 };
			System.out.println(x[6]);// out of bound
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of																				// exception as a string value.

		}
	}

}
 