package com.tekarch.ExceptionsDay3;

import java.math.BigDecimal;

public class Q1_ArithmeticExceptionsDemo {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		int result=0;
		
		BigDecimal a1 = new BigDecimal(11);  
		BigDecimal a2 = new BigDecimal(17);  
		
		try {
		//result=a/b;
		//Integer.parseInt("s");	//java.lang.NumberFormatException
			
		a1=a1.divide(a2);
			
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage()); //Non-terminating decimal expansion; no exact representable decimal result.
		}
		//System.out.println(result);

	}

}
