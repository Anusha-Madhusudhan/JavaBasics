package com.tekarch.ExceptionsDay3;

import java.util.Scanner;

public class Q3_NullPointerExceptionsDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str=scanner.nextLine();
		System.out.println("is string empty :"+str.isEmpty());
		
		try {
		
		toUppercase(str);
		}catch (NullPointerException e) {
			System.out.println(e.getClass());
			System.out.println("String should not be null");
			
		}
		
		scanner.close();
	}

	private static String toUppercase(String str) throws NullPointerException{
		
		
		if(str.isEmpty()) {
			throw new NullPointerException();
		}
		else {
			
			System.out.println(str.toUpperCase());
		}
		
		return null;
	}

}
