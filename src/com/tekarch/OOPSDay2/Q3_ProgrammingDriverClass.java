package com.tekarch.OOPSDay2;


class Programming{
	
	public Programming() {
		System.out.println("I love programming languages");
	}
	
    public Programming(String message) {
		System.out.println("I Love "+message);
	}
	
	
}

public class Q3_ProgrammingDriverClass {

	public static void main(String[] args) {
		
		Programming pgm1=new Programming();
		
		Programming pgm2=new Programming("JAVA");
		

	}

}
