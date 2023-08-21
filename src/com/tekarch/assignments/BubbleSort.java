package com.tekarch.assignments;

public class BubbleSort {
	
	
	/*
	 * Bubble sort is a sorting algorithm that compares two adjacent elements
	 *  and swaps them until they are in the intended order.

Just like the movement of air bubbles in the water that rise up to the surface, 
each element of the array move to the end in each iteration. Therefore, it is called a bubble sort.


	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] a= {1,6,7,0,4,2,12,77,5};
		int temp;
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-i-1; j++) {
				
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}

	}

}
