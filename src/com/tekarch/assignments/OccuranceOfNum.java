package com.tekarch.assignments;

public class OccuranceOfNum {

	public static void main(String[] args) {
		int[] arr= {1,3,44,5,6,77,3,2,1,3,5,1};
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			System.out.println("The number "+arr[i]+" occured "+ count +" times");
			count=0;
		}

	}

}
