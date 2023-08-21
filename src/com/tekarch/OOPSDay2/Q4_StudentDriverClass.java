package com.tekarch.OOPSDay2;

class Student{
	
	private String StuName;
	
	public Student() {
		System.out.println("Name of the Student is Unknown");
	}
	
    public Student(String name) {
		this.StuName=name;
		System.out.println("Name of the student is "+StuName);
	}
	
}

public class Q4_StudentDriverClass {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		Student stu2=new Student("XYZ");

	}

}
