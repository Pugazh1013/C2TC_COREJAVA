package project1;

public class Employee {
	 private int empId;
	 private String name;
	 private double salary;
	 public Employee(int empId, String name, double salary) throws IllegalArgumentException {
	     if (salary < 0) {
	         throw new IllegalArgumentException("Salary cannot be negative.");
	     }
	     this.empId = empId;
	     this.name = name;
	     this.salary = salary;
	 }
	 public int getEmpId() {
	     return empId;
	 }

	 public String getName() {
	     return name;
	 }

	 public double getSalary() {
	     return salary;
	 }
	 public void displayDetails() {
	     System.out.println("Employee ID: " + empId);
	     System.out.println("Name: " + name);
	     System.out.println("Salary: " + salary);
	 }
}

