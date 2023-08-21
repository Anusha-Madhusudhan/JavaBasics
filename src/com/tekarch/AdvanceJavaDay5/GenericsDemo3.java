package com.tekarch.AdvanceJavaDay5;


 class Generics2<T,U>{
	 
	 T obj1;
	 U obj2;
	 
	 public Generics2(T a,U b) {
		this.obj1=a;
		this.obj2=b;
	}
	 
	 void display() {
		 System.out.println(this.obj1+"  "+this.obj2);
	 }
	 
 }

public class GenericsDemo3 {
	
	public static void main(String[] args) {
		

		Generics2<Integer,String> ob1=new Generics2<Integer,String>(1, "Anusha");
		Generics2<Integer,String> ob2=new Generics2<Integer,String>(2, "Krishna");
		
		ob1.display();
		ob2.display();
	}

}
