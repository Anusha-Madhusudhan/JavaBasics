package com.tekarch.AdvanceJavaDay1;

public class Q4_ReplaceVowelInTheString {

	public static void main(String[] args) {
		
		String s="Anusha";
		
		char[] charArray=s.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			char c=charArray[i];
			
			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
				
				//s.replace(c, 'X');
				charArray[i]='X';
				
			}
			
		}
		
		
		System.out.println(String.valueOf(charArray));

	}

}
