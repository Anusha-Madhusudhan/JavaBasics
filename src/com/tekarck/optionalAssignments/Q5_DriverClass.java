package com.tekarck.optionalAssignments;

public class Q5_DriverClass {

	public static void main(String[] args) {
		
		//Sortable bSort=new BubbleSort();
		
		Sortable quick=new QuickSort();
		int[] a= {1,6,7,0,4,2,12,77,5};
		//bSort.sort(a);
		
		quick.sort(a);

	}

}
