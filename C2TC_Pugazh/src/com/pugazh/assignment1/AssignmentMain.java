package com.pugazh.assignment1;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating objects for Manager and Developer
        Manager manager = new Manager("Alice", 101, 90000, "HR");
        Developer developer = new Developer("Bob", 102, 80000, "Java");

        // Using EmployeeUtilities to display details
        EmployeeUtilities utilities = new EmployeeUtilities();
        utilities.displayEmployeeDetails(manager);
        utilities.displayEmployeeDetails(developer);


	}

}
