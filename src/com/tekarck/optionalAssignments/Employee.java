package com.tekarck.optionalAssignments;

public class Employee {
	
	String name;
	double salary;
	
	public Employee() {
		
	}
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
		
	}

	void displayInfo(){
		System.out.println("Name and Salary of an Employee is "+name+" "+salary);
	}
	

}
