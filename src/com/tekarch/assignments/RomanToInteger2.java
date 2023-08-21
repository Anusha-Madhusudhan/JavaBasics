package com.tekarch.assignments;

import java.util.Scanner;

public class RomanToInteger2 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the Roman value: ");
		String key=sca.next();
		
		int[] numericValues= {1000,500,100,50,10,5,1};
		char[] romanValues= {'M','D','C','L','X','V','I'};
		
		
		int result = 0;
		int currentRomanValueInt=0;
		int nextRomanValueInt=0;
		
		char currentRomanValue = 0;
		char nextRomanValue = 0;
		
		
		for (int i = 0; i <key.length(); i++) {
			
			currentRomanValue=key.charAt(i);
			nextRomanValue=key.charAt(i+1);
			
			for (int j = 0; j < romanValues.length; j++) {
				if(currentRomanValue==romanValues[j]) {
					currentRomanValueInt=numericValues[j];
				}
				if(nextRomanValue==romanValues[j]) {
					nextRomanValueInt=numericValues[j];
				}
				
				}
			
			if(currentRomanValueInt>=nextRomanValueInt) {
				result+=currentRomanValueInt;
			}
			else {
				//result-=currentRomanValueInt;
				result+=nextRomanValueInt-currentRomanValueInt;
				
			}
			if(i==key.length()-2) {
				break;
			}
			
			
		}
		System.out.println(result);
		
		sca.close();

	}

}
