package com.tekarch.assignments;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int res=fact(n);
		System.out.println(res);

	}

	private static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
		
	}

}
