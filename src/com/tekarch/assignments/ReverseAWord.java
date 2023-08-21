package com.tekarch.assignments;

import java.util.Arrays;

public class ReverseAWord {

	public static void main(String[] args) {
		String s="I am anu usah";
		
		String[] str=s.split(" ");
		
		String[] rev=new String[str.length];
		
		String reverse = null;
		
		for (int x=0; x<str.length; x++) {
			char c[] =new char[str[x].length()];
			int j=0;
			for (int i = str[x].length()-1; i >=0; i--) {
				
				c[j++]=str[x].charAt(i);
				
			}
			
			rev[x]=new String(c);
			System.out.println(rev[x]);
			
		}
		
		// String array to String
		
		//reverse=Arrays.toString(rev);
		reverse=String.join(" ", rev);
		
		
		
		System.out.println(s);
		
		System.out.println(reverse);
		
		

	}

}
