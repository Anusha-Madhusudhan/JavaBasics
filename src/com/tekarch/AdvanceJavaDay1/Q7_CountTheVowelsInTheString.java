package com.tekarch.AdvanceJavaDay1;

public class Q7_CountTheVowelsInTheString {

	public static void main(String[] args) {
		String s="Anusha";
		
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			
         if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
				
				count++;
				
			}
			
		}
		
		System.out.println("Number of vowels in the given String are "+count);

	}

}
