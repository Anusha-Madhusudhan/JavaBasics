package com.tekarch.day2;

public class Student {
	
	String name;
	int roll_no;
	
	public Student(int roll_no, String name) {
		
		this.name=name;
		this.roll_no=roll_no;
		
	}
	
	public Student() {
		
	}

	public static void show() {
	
		System.out.println("inside static method show");
		Student s2=new Student();
		s2.display();
	}




	public void display() {
		System.out.println(name+"   "+roll_no);
		show();            // static method
		display2();         // non static method
		
	}
	
	public void display2() {
		
	}
	
	
	

	public static void main(String[] args) {
		
		Student s=new Student(2,"Jhon");
		s.display();  // non static method
		show();    // static method
		
		
	}

}
