package com.tekarch.day2;




public class StaticDemo {
	
	public class Test{
		
		static String s="aaa";
		
	}

	public static void main(String[] args) {


		Test.s.length();  // it is same as System.out.println();
		                  // where System is a class out is PrintStream class object
		                  //which is static variable in System class. 
		                  //
		System.out.println(Test.s.length()); 

	}

}
