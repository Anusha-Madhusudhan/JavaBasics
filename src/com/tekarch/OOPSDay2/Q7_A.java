package com.tekarch.OOPSDay2;

public class Q7_A {
	
	

		void sum(int x, int y){

		 System.out.println("Sum of two numbers: " +(x+y)); } 

		void sum(int x, int y, int z){ 

		System.out.println("Sum of three numbers: " +(x+y+z)); } 

		public static void main(String[] args){ 

			Q7_A a = new Q7_A(); 

		a.sum(20, 30);  // method overloading

		 a.sum(30, 40, 50);

		 }

		

}
