package com.tekarch.day2;

public class School {
	
	static String schoolName="TekArch";
	int sid;
	String sname;
	
	public School(int i, String string) {
		this(i);
		//sid=i;
		sname=string;
	}
	
	public School(int i) {
		sid=i;
		
	}


	public void display() {
		System.out.println(schoolName+"  "+sid+"  "+sname);
	}
	

	public static void main (String[] args) {

      School s1=new School(1,"aaa");
      School s2=new School(2,"ccc");
      School s3=new School(3,"vvv");
      s1.display();
      s2.display();
      s3.display();
      

       
		

	}

}
