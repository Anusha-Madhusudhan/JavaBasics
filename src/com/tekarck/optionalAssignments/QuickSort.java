package com.tekarck.optionalAssignments;

public class QuickSort implements Sortable {

	@Override
	public void sort(int[] arry) {
		
		System.out.println("inside the quick sort method");
		
		int n=arry.length;
		
		qyickSort(arry,0,n-1);
		
	}
	//{1,6,7,0,4,2,12,77,5};

	private void qyickSort(int[] arry, int start, int end) {
		
		if(start<end) {
			
		int pivot=arry[end];
		int pivotIndex=end;
	
		
		
			
			for(int j=start;j<=end;j++) {
				if(pivotIndex>=j) {
				if(arry[j]>pivot) {
					int temp=arry[j];
					arry[j]=pivot;
					arry[pivotIndex]=temp;
					
					pivotIndex=j;
					
				}
				
				}
				else {
					if(arry[j]<pivot) {
						int temp=arry[j];
						arry[j]=pivot;
						arry[pivotIndex]=temp;
						
//						int t=pivotIndex;
						pivotIndex=j;
//						j=t;
						
					}
					
				}
				 
				
				
			}
			
			
			
			
			System.out.println("pivot is "+pivot);
			System.out.println("pivot index :"+pivotIndex);
			
			for (int i1 : arry) {
				System.out.print(i1+" ");
			}
			System.out.println();
			
			qyickSort(arry, start, pivotIndex-1);  
			qyickSort(arry, pivotIndex+1 , end); 
			
		}
		 
		
		
		
	}

}
