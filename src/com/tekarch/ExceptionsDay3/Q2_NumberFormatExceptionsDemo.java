package com.tekarch.ExceptionsDay3;

import java.util.Scanner;

public class Q2_NumberFormatExceptionsDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.next();
		
		int a=0;
		
		
		try {
			a=Integer.parseInt(str);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			
			System.out.println(e.getClass());
		}
		
		System.out.println("value of a "+a);

		scanner.close();
	}

}
