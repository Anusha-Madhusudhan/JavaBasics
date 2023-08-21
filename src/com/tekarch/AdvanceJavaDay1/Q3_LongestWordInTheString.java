package com.tekarch.AdvanceJavaDay1;

import java.util.Scanner;

public class Q3_LongestWordInTheString {

	public static void main(String[] args) {
		
       String str;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the String ");
		str=scanner.nextLine();
		
		String[] strArray=str.split(" ");
		
		String longet=strArray[0];
		
		for (int i = 1; i < strArray.length; i++) {
			
			if(longet.length()<strArray[i].length()) {
				
				longet=strArray[i];
				
			}
			
		}
		
		System.out.println("longest word in the given String is "+ longet+" and length is "+longet.length());
		
		
		scanner.close();

	}

}
