package com.tekarch.ExceptionsDay3;

public class ThowAndThrowsDemo {
	
	static void fun() throws ArithmeticException {
		
		int a=10;
		int b=4;
		
		if(b<5) {
			throw new ArithmeticException(" b should be greater than 5");
		}
		
	}

	public static void main(String[] args)  {
		
		
		
		
		try {
		fun();}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rrrrrrrrrrr");

	}
	
	
	

}
