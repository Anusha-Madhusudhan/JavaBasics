package com.tekarch.AdvanceJavaDay1;

import java.util.Scanner;

public class Q6_RemovingWhiteSpacesFromString {

	public static void main(String[] args) {
		String str;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the String ");
		str=scanner.nextLine();
		
		String newString=str.replace(" ", "");
		
		System.out.println(newString);
		scanner.close();

	}

}
