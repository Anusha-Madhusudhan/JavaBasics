package com.tekarch.assignments;



public class InsertElemInAnArray {

	public static void main(String[] args) {
		int[] a= {2,4,3,8,5,0,1};
		
		int key=9;
		int pos=3;
		
		int[] a2=new int[a.length+1];
		int j=0;
		for (int i = 0; i < a2.length; i++) {
			
			if(i==pos) {
				a2[pos]=key;
				System.out.print(a2[i]+" ");
				continue;
			}
			
			a2[i]=a[j++];
		
			
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		// removing element from an array
		
		int[] r= {2,4,3,8,5,0,1};
		int key2=8;
		int[] a3=new int[r.length-1];
		int x=0;
		for (int i = 0; i < r.length; i++) {
			
			if(key2==r[i]) {
				
				continue;
			}
			
			a3[x]=r[i];
		
			
			System.out.print(a3[x]+" ");
			x++;
		}
		

	}

}
