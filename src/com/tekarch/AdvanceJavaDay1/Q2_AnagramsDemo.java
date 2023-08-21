package com.tekarch.AdvanceJavaDay1;

import java.util.Scanner;

// Anagrams are two strings that contain the same characters in a different order.

public class Q2_AnagramsDemo {

	public static void main(String[] args) {
		String str1;
		
		String str2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter 1st String ");
		str1=scanner.nextLine();
		System.out.println("enter 2nd String ");
		str2=scanner.nextLine();
		int flag=0;
		if(str1.length()==str2.length()) {
			
			int strLen=str2.length();
			
			for (int i = 0; i < strLen; i++) {
				
				char c=str2.charAt(i);
				
				for (int j = 0; j <strLen; j++) {
					
					
					if(c==str1.charAt(j)) {
						flag++;         // if char present in the second String increment the flag.
						break;
					}
					}}
			if(flag==strLen) {
				System.err.println(" Anagrams");
			}
			else {
				System.err.println("NOt Anagrams");
			}
			}else {
			System.err.println("NOt Anagrams");
		}
		scanner.close();

	}

}
