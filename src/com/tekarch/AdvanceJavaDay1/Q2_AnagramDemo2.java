package com.tekarch.AdvanceJavaDay1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_AnagramDemo2 {
	
	public static void main(String[] args) {
		String str1;
		
		String str2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter 1st String ");
		str1=scanner.nextLine();
		System.out.println("enter 2nd String ");
		str2=scanner.nextLine();
		String s1=str1.replace(" ", "");
		String s2=str2.replace(" ", "");
		isAnagram(s1,s2);
		scanner.close();
	}

	private static void isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram");
		}
		else {
		
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		}
	}
	

}
