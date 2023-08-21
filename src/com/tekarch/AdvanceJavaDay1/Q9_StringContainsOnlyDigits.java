package com.tekarch.AdvanceJavaDay1;

import java.util.regex.Pattern;

public class Q9_StringContainsOnlyDigits {
	
	// ASCII value of digits 0 to 9 is 48 to 57.

	public static void main(String[] args) {
		
		String s="12345612.11";
		boolean flag=true;
		
		/*for (int i = 0; i < s.length(); i++) {
			
			char c=s.charAt(i);
			if(!Character.isDigit(c)) {
				flag=false;
				break;
			}
		}
			
		if(flag) {
			System.out.println("Given String "+s+" contains only digits");
		}
		else {
			System.out.println("Given String "+s+" does not contains only digits");
		}
*/
		
		
		System.out.println(Pattern.matches("[0-9]{"+s.length()+"}", s));
		
		
	}

}
