package com.tekarch.assignments;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Anusha";
		
		char[] c=new char[s.length()];
		int j=0;
		
		
		for (int i = s.length()-1; i >= 0; i--) {
			c[j++]=s.charAt(i);
		}
		
		String rev=new String(c);
		System.out.println(rev);

	}

}
