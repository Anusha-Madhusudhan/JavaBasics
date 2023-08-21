package com.tekarch.AdvanceJavaDay5;


class MyGeneric<T>{   // generic class which refers to any type of objects. 
	
	T t;
	
	void add(T t) {
		this.t=t;
	}
	
	T get(){
		return t;
	}
	
}

public class MyGenericDriverClass {

	public static void main(String[] args) {
		
		MyGeneric<Integer> i=new MyGeneric<Integer>();
		
		i.add(40);
		
		System.out.println(i.get());  // 40
		
		
       MyGeneric<String> s=new MyGeneric<String>();
		
		s.add("Anu");
		
		System.out.println(s.get());  // Anu
		

	}

}
