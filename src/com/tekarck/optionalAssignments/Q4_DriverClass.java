package com.tekarck.optionalAssignments;

public class Q4_DriverClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee("XYZ",6200.88);
		
		Employee manager=new Manager(44000);
		
		Employee developer=new Developer("JAVA");
		
		
		emp.displayInfo(); // Name and Salary of an Employee is XYZ 6200.88
		manager.displayInfo();  //Bonus is :44000.0
		developer.displayInfo();  //Programming Language :JAVA
		

	}

}
