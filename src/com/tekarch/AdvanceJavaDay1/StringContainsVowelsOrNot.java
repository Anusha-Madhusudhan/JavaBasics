package com.tekarch.AdvanceJavaDay1;

import java.util.regex.Pattern;

public class StringContainsVowelsOrNot {

	public static void main(String[] args) {
		
		String s="Anusha";
		
//		//String pattern="[aeiouAEIOU]?";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(Pattern.matches("[aeiouAEIOU]", String.valueOf(s.charAt(i)))) {
				System.out.println("its a vowel  " +s.charAt(i));
				count++;
			}
		}
		
		System.out.println("Number of vowels in th string "+s+" is "+count);
		
		
		

	}

}
