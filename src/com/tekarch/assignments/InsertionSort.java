package com.tekarch.assignments;

public class InsertionSort {

	public static void main(String[] args) {

		int[] a= {9,5,1,4,3};
		
		int n=a.length;
		
		insertionSort(a,n);
	}

	private static void insertionSort(int[] a, int n) {
		
		
		for(int i=1;i<n;i++) {
			
			int key=a[i];
			
			
		for(int j=i-1;j>=0;j--) {
				
				if(key<a[j]) {
					int temp=a[j];
					a[j]=key;
					a[j+1]=temp;
				}
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
