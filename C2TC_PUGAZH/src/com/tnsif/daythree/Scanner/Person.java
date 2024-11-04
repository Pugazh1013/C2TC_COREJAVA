package com.tnsif.daythree.Scanner;

public class Person {
		private String Name;
		private double Income;
		private String Gender;
		private int Age;
		private double Tax;
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getIncome() {
			return Income;
		}
		public void setIncome(double income) {
			Income = income;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public double getTax() {
			return Tax;
		}
		public void setTax(double tax) {
			Tax = tax;
		}
		@Override
		public String toString() {
			return "Person [Name=" + Name + ", Income=" + Income + ", Gender=" + Gender + ", Age=" + Age + ", Tax="
					+ Tax + "]";
		}
		
		
		

}
