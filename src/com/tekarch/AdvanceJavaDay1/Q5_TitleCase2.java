package com.tekarch.AdvanceJavaDay1;

import java.util.Scanner;

public class Q5_TitleCase2 {

	public static void main(String[] args) {
		    String str;
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("enter the String ");
			str=scanner.nextLine();
			
			String[] strArray=str.split(" ");
			String finalStr="";
			
			for (String s : strArray) {
				
				finalStr=finalStr+(s.substring(0, 1).toUpperCase()+s.substring(1, s.length())+" ");
				
			}
			
			
			
			System.out.println(finalStr);
			
			
			scanner.close();

	}

}
