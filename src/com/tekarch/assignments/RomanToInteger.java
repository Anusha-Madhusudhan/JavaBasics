package com.tekarch.assignments;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the Roman value: ");
		String key=sca.next();
		
		int[] numericValues= {1000,500,100,50,10,5,1};
		char[] romanValues= {'M','D','C','L','X','V','I'};
		
		
		int result = 0;
		int currentRomanValue=0;
		int nextRomanValue=0;
		
		
		//CXXIV
			
					
						
						for (int j = 0; j < key.length(); j++) {
							
							for (int i = 0; i < romanValues.length; i++) {
							
								if(key.charAt(j)==romanValues[i]) {
									
									currentRomanValue=nextRomanValue;     // current res
									nextRomanValue=numericValues[i]; // next res
									
									break;
								}
								
						}
							
							//if(j==0) {
							//	result=nextRomanValue;
							//}
							
							//if(j>=1) {
							// if current Roman value greater than next then add that to result
							if(currentRomanValue>=nextRomanValue) { 
								result+=nextRomanValue; 
							}
							// if current Roman value less than next then subtract that value from next Roman value
							else {
								result-=currentRomanValue;
								result+=nextRomanValue-currentRomanValue;  
							}
							//}	
					}
					
				
			System.out.println(result); // 124
		
		
		
		
		
		
		
		
		
		
		sca.close();

	}

}
