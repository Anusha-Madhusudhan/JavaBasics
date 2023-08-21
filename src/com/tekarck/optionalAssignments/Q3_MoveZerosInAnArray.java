package com.tekarck.optionalAssignments;

public class Q3_MoveZerosInAnArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,0,5,0,6,3,0,7,0,8,10,0};
		int n=a.length;
		
		moveZerostoEnd(a,n);

	}

	private static void moveZerostoEnd(int[] a, int n) {
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				int j=i;          // for(int j=i;j<n-1;j++)
				while(j<n-1) {
					a[j]=a[j+1];
					j++;
				}
				a[j]=0; // last element appending zeros
			}
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
