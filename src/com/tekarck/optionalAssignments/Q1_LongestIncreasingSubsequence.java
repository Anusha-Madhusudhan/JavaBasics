package com.tekarck.optionalAssignments;

public class Q1_LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int[] a= {10, 9, 2, 5, 3, 7, 101, 18,77,33,120,11};
		
		int n=a.length;
		
		longestIncreasingSubSequence(a,n);
				
				
			

	}

	private static void longestIncreasingSubSequence(int[] a, int n) {
		// int[] a= {10, 9, 2, 5, 3, 7, 101, 18,77,33,120,11};
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			int count=1;
			int temp = a[i];  // it has to check with the previous bigger number. 
			
			for (int j = i+1; j < n; j++) {
				
				if(temp<a[j]) {  //a[i]<a[j]&&temp<a[j]
					
					temp=a[j];
					
					System.out.print(a[j]+" ");
					
					count++;
				}
			}
			System.out.print("   length of increasing subsequence is :"+count);
			System.out.println();
		}

		
	}

}
