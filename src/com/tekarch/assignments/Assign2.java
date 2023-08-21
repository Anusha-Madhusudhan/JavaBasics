package com.tekarch.assignments;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		int n1=sca.nextInt();
		System.out.println("Enter second num: ");
		int n2=sca.nextInt();
		System.out.println("Enter third num: ");
		int n3=sca.nextInt();
		
		
		
		if(n1>n2&&n1>n3) {
			System.out.println(n1+" is biggest num");
		}
		else if(n2>n1&&n2>n3) {
			System.out.println(n2+" is biggest num");
		}
		else {
			System.out.println(n3+" is biggest num");
		}
		
		
		if(n1<n2&&n1<n3) {
			System.out.println(n1+" is smallest num");
		}
		else if(n2<n1&&n2<n3) {
			System.out.println(n2+" is smallest num");
		}
		else {
			System.out.println(n3+" is smallest num");
		}
		
		if((n1<n2&&n1>n3)||(n1<n3&&n1>n2)) {
			System.out.println(n1+" is 2nd biggest num");
		}
		else if((n2<n1&&n2>n3)||(n2<n3&&n2>n1)) {
			System.out.println(n2+" is 2nd biggest num");
		}
		else {
			System.out.println(n3+" is 2nd biggest num");
		}
		
		// if((n3<n2&&n3>n1)||(n3>n2&&n3<n1))
		
		sca.close();

	}

}
