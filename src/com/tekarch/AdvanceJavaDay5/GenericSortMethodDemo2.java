package com.tekarch.AdvanceJavaDay5;

public class GenericSortMethodDemo2 {

	public static void main(String[] args) {
		
		Integer[] a= {1,44,6,8,3,9,3,0};
		
		Character[] c= {'s','h','p','a','i','d','t'};
		
		String[] s= {"Anusha","Krishna","Basavaraj","Dhavith","Sumedh"};
		
		genericSortMethod(s);

	}

	private static <E extends Comparable<E>> void genericSortMethod(E[] e) {
		
		int n=e.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(e[i].compareTo(e[j])>0) {
					
					E temp=e[i];
					e[i]=e[j];
					e[j]=temp;
					
				}
			}
		}
		
		
		for(E ele:e) {
			System.out.print(ele+" ");
		}
		
	}

}
