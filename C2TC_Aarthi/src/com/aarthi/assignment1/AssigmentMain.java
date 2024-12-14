package com.aarthi.assignment1;
import com.aarthi.assignment1.Employee.*;
import com.aarthi.assignment1.EmployeeUtilities;
public class AssigmentMain {

	public static void main(String[] args) {
		        // Creating objects for Manager and Developer
		        Manager manager = new Manager("Alice", 101, 90000, "HR");
		        Developer developer = new Developer("Bob", 102, 80000, "Java");

		        // Using EmployeeUtilities to display details
		        EmployeeUtilities utilities = new EmployeeUtilities();
		        utilities.displayEmployeeDetails(manager);
		        utilities.displayEmployeeDetails(developer);
	}

}
