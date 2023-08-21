package com.tekarch.assignments;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the int value: ");
		int key=sca.nextInt();
		
		int[] numericValues= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanValues= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		String result = "";
		
	
		
		for (int i = 0; i < numericValues.length; i++) {
			
			
			
			while(numericValues[i]<=key) {
				result=result+romanValues[i];
				key=key-numericValues[i];
			}
			
			if(key==0)
				break;
			
		}
		System.out.println(result);
		
		
		sca.close();
		
	}

}
