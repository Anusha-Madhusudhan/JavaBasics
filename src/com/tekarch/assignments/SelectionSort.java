package com.tekarch.assignments;

public class SelectionSort {
	
	/*
	 * Selection sort is a sorting algorithm that selects the smallest element
	 *  from an unsorted list in each iteration and places that element at the beginning 
	 *  of the unsorted list.


	 */

	public static void main(String[] args) {
		int[] a= {1,6,7,0,4,2,12,77,5};
		
		
		int pos = 0;
		int temp;
		
		for (int j = 0; j < a.length; j++) {
			
			int smallest=a[j];
		
		for (int i = j; i < a.length; i++) {
			
			if(smallest>a[i]) {
				smallest=a[i];
				pos=i;
			}
			
		}
		temp=a[j];
		a[j]=smallest;
		a[pos]=temp;
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
	}

}
