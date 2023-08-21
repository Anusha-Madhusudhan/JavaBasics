package com.tekarck.optionalAssignments;

public class Manager extends Employee {
	
	
	double bonus;
	
	public Manager(String name, double salary,double bonus) {
		super(name, salary);
		this.bonus=bonus;
	}
	
	public Manager(double bonus) {
		this.bonus=bonus;
	}

	
	
	@Override
	void displayInfo() {
		
		System.out.println("Bonus is :"+bonus);
	}

}
