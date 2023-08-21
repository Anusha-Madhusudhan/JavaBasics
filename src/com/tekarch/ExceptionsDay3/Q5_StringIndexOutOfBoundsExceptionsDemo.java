package com.tekarch.ExceptionsDay3;

import java.util.Scanner;

public class Q5_StringIndexOutOfBoundsExceptionsDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str=scanner.nextLine();
		try {
			System.out.println(str.substring(3, 11));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		
		

	}

}
