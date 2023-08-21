package com.tekarch.day2;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Integer num: ");
		/*int a=scanner.nextInt();
		
		System.out.println("Enter Float num: ");
		float f=scanner.nextFloat();
		
		System.out.println("Enter double num: ");
		double d=scanner.nextDouble();
		
		System.out.println("Enter boolean num: ");
		boolean b=scanner.nextBoolean();
		
		System.out.println("Enter String num: ");
		String s=scanner.next();
		
		System.out.println(a+"  "+f+"  "+d+"   "+b+"  "+s.length()); */
		
		System.out.println("Enter name , age , gender , address :");
		String s1=scanner.nextLine();
		
		String s2[]=s1.split(" ");
		
		for (int i = 0; i < s2.length; i++) {
			
			System.out.println(s2[i]);
		}
		
		
		
		scanner.close();

	}

}
