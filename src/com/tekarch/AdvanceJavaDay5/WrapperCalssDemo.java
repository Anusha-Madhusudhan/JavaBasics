package com.tekarch.AdvanceJavaDay5;

public class WrapperCalssDemo {

	public static void main(String[] args) {
		int a=5;
		
		Integer i=Integer.valueOf(a);
		
		System.out.println(i);
		
		System.out.println(Integer.reverse(12345));
		
		System.out.println(Integer.parseInt("122"));
		
		System.out.println(Integer.compare(3, 5));
		
		System.out.println(Integer.max(8, 79));
		
		System.out.println(Integer.valueOf("44"));
		
		System.out.println(Integer.toString(a));
		
		Character c=Character.valueOf('v');
		
		System.out.println(c.charValue());
		
		System.out.println(Character.getNumericValue('p'));  //25
		
		for (char c1='a'; c1 < 'z'; c1++) {
			System.out.println(Character.getNumericValue(c1));
		}
		
		System.out.println(Character.isAlphabetic('d')); //true
		
		System.out.println(Character.isDigit('1')); //true
		
		String str="Anusha";
		
		String message=String.join("-", "anusha","basavaraj","krisha","Sumedh");  // anusha-basavaraj-krisha-Sumedh
		System.out.println(message);
	

	}

}
