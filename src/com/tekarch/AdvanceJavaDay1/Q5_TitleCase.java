package com.tekarch.AdvanceJavaDay1;

import java.util.Scanner;

public class Q5_TitleCase {

	public static void main(String[] args) {
		    String str;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("enter the String ");
			str=scanner.nextLine();
			
			String[] strArray=str.split(" ");
			
			String finalString = "";
			for (String s : strArray) {
				
				char[] c=s.toCharArray();   // converting string to char array
				
				c[0]=Character.toUpperCase(c[0]);
				
				
				finalString=finalString.concat(String.valueOf(c)+" ");
				
			}
			
			
			System.out.println(finalString);
			
			
			
			scanner.close();

	}

}
