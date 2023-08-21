package com.tekarch.assignments;

import java.util.Scanner;

public class DigitsToString {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter int value : ");
		int a = sca.nextInt();
		
		int count=0;
		
		int temp=a;
		while(a>0) {
			count++;
			a=a/10;
		}
		int[] digits = new int[count];
		
		while(temp>0) {
			
			digits[--count]=temp%10;
			temp=temp/10;
		}
		
		
		for (int i = 0; i<digits.length; i++) {
			switch (digits[i]) {
			case 1:System.out.print("One ");

				break;
			case 2:System.out.print("Two ");

				break;
			case 3:System.out.print("Three ");

				break;
			case 4:System.out.print("Four ");

				break;
			case 5:System.out.print("Five ");

				break;
			case 6:System.out.print("Six ");

				break;
			case 7:System.out.print("Seven ");

				break;
			case 8:System.out.print("Eight ");

				break;
			case 9:System.out.print("Nine ");

				break;
			case 0:System.out.print("Zero ");

				break;

			default:System.out.println("Invalid number");
				break;
			}
		}
		

		

		sca.close();
	}

}
