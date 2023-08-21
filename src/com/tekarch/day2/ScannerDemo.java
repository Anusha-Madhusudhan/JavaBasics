package com.tekarch.day2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {


		Scanner sca=new Scanner(System.in);
		
		System.err.println("enter the number1 : ");
		int num1=sca.nextInt();
		System.err.println("enter the number2 : ");
		int num2=sca.nextInt();
		System.err.println("enter the number3 : ");
		int num3=sca.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("greatest number is :"+num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("greatest number is :"+num2);
		}
		else {
			System.out.println("greatest number is :"+num3);
		}
		
		
		// Swapping 2 numbers
		
		
	/*	int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"   "+b); */
		
		sca.close();

	}

}
