package com.tekarck.optionalAssignments;

public class BubbleSort implements Sortable {

	@Override
	public void sort(int[] arry) { 
		
		//int temp;
		
		for(int i=0;i<arry.length;i++) {
			for(int j=i+1;j<arry.length;j++) {
				if(arry[i]>arry[j]) {
					
					int temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
					
					
				}
			}
		}
		
		for(int i:arry) {
			System.out.print(i+" ");
		}
		
	}

}
