package com.tekarch.AdvanceJavaDay5;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {
	
	static <E> void display(E[] elements) {   //  static generic method which can accepts ant type of arguments
		
		for (E e : elements) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	<E> void show(E arg) {   // non static generic method
		
		System.out.println(arg);
	}
	
	
   static  void show2(List<? extends Number> args) {   //=====> any type which extends Number class like Integer Float Double
		                                               // List<? super Integer>  ==> which takes all the super classes of Integer
	                                                   // List<?> ==> which takes any type of objects
		for (Number number : args) {
			System.out.println(number);
		}
	}
   
   
   static <T extends Number> void add(T a,T b){
	   
//	   if(a instanceof Integer && b instanceof Integer) {
//			Integer i=(Integer) a;
//			Integer j=(Integer) b;
//			System.out.println("adding Integer numbers "+(i+j));
//		}
	   
	   System.out.println(a.intValue()+b.intValue());
	   
   }
	
	

	public static void main(String[] args) {
		
//		Integer[] i= {1,2,5,7,9,0};
//		
//		Character[] c= {'s','f','b','n'};
//		
//		display(i);
//		
//		display(c);
//		
//		
//		GenericMethodDemo gm=new GenericMethodDemo();
//		gm.show(2);
//		gm.show("Anu");
//		gm.show('c');
//		
//		
//		
//		
//		List<Integer> ilist=new ArrayList<Integer>();
//		ilist.add(1);
//		ilist.add(6);
//		ilist.add(8);
//		ilist.add(3);
//		
//		List<Float> flist=new ArrayList<Float>();
//		flist.add(1.9f);
//		flist.add(6.66f);
//		flist.add(8.07f);
//		flist.add(3.32f);
//		
//		show2(flist);
		
		add(1,2);
		
		
		

	}

}
