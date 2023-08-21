package com.tekarck.optionalAssignments;

import java.util.Arrays;

public class Q2_ArrayRotation {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int n=a.length;
		int k=3;
		
		
		System.out.println("Array before rotation "+k+" times");
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		rightRotation(a,n,k);
		
		
//		leftRotation(a,n,k);
		
		
		

	}

	private static void leftRotation(int[] a, int n, int k) {
		
		for(int j=0;j<k;j++) {
			int temp=a[0];    // storing the first element of the array in temp variable
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];
			}
			a[n-1]=temp;
		}
		
		System.out.println("Array after rotation "+k+" times");
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}

	private static void rightRotation(int[] a, int n, int k) {
		// rotating the array to right direction
		
		
//				for(int j=0;j<k;j++) {   // this is how many times the given array has to rotate.
//					
//					int temp=a[n-1];         // storing the last element of the array in temp variable
//					
//						for(int i=n-1;i>0;i--) {
//							
//							
//							a[i]=a[i-1];
//						
//					}
//						
//					a[0]=temp;
//				}
//				
//				System.out.println("Array after rotation "+k+" times");
//				
//				for (int i : a) {
//					System.out.print(i+" ");
//				}
		
		
		for (int j = 0; j < k; j++) {
			   for (int i = n - 1; i > 0; i--) {

			    int temp = a[i];
			    a[i] = a[i - 1];
			    a[i - 1] = temp;

			   }
			  }
			  System.out.println(Arrays.toString(a));
		
	}

}
