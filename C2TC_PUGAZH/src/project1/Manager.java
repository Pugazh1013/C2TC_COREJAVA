package project1;

public class Manager extends Employee {
	 private String department;
	 public Manager(int empId, String name, double salary, String department) throws IllegalArgumentException {
	     super(empId, name, salary);
	     this.department = department;
	 }
	 public String getDepartment() {
	     return department;
	 }
	 @Override
	 public void displayDetails() {
	     super.displayDetails();
	     System.out.println("Department: " + department);
	 }
}