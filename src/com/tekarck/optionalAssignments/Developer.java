package com.tekarck.optionalAssignments;

public class Developer extends Employee{
	
	String programmingLanguage;
	
	
	public Developer(String programmingLanguage) {
		this.programmingLanguage=programmingLanguage;
	}

	public Developer(String name, double salary ,String programmingLanguage) {
		super(name, salary);
		this.programmingLanguage=programmingLanguage;
	}

	
	
	@Override
	void displayInfo() {
		
		System.out.println("Programming Language :"+programmingLanguage);
	}
}
