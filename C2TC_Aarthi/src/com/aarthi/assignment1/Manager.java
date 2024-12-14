package com.aarthi.assignment1;

public class Manager extends Employee {
	    private String department;

	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    // Getters and Setters
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Department=" + department;
	    }

}
