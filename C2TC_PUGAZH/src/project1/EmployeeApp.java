package project1;

import java.util.Scanner;

public class EmployeeApp {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     try {
	         System.out.println("Enter Employee ID:");
	         int empId = scanner.nextInt();
	         scanner.nextLine(); 
	         System.out.println("Enter Employee Name:");
	         String name = scanner.nextLine();
	         System.out.println("Enter Employee Salary:");
	         double salary = scanner.nextDouble();
	         scanner.nextLine(); 
	         System.out.println("Is this employee a Manager? (yes/no):");
	         String isManager = scanner.nextLine().trim().toLowerCase();
	         if (isManager.equals("yes")) {
	             System.out.println("Enter Manager's Department:");
	             String department = scanner.nextLine();
	             Manager manager = new Manager(empId, name, salary, department);
	             System.out.println("\nManager Details:");
	             manager.displayDetails();
	         } 
	         else {
	             Employee employee = new Employee(empId, name, salary);
	             System.out.println("\nEmployee Details:");
	             employee.displayDetails();
	         }
	     } catch (IllegalArgumentException e) {
	         System.out.println("Error: " + e.getMessage());
	     } catch (Exception e) {
	         System.out.println("An unexpected error occurred: " + e.getMessage());
	     } finally {
	         scanner.close();
	     }
	 }
}


