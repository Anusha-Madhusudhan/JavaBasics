package com.tekarch.AdvanceJavaDay5;


class Generics<AnyType>{
	AnyType at;
	AnyType bt;
	
//	public Generics(AnyType at) {
//		this.at=at;
//		
//	}
//	
//	public Generics(AnyType at,AnyType bt) {
//		this.at=at;
//		this.bt=bt;
//	}
	
	
	AnyType getType() {
		return at;
	}
	
	void showType() {
		System.out.println("type of data is "+at.getClass().getName());
	}

	
	public  void add(AnyType a, AnyType b) {
		
		
		
//		if(a.getClass().isInstance(Integer.class)&& b.getClass().isInstance(Integer.class)) {
//			Integer i=(Integer) a;
//			Integer j=(Integer) b;
//			System.out.println("adding Integer numbers "+(i+j));
//			
//		}
//		
//		if(a.getClass().isInstance(Float.class)&& b.getClass().isInstance(Float.class)) {
//			Float i=(Float) a;
//			Float j=(Float) b;
//			System.out.println("adding Floating numbers "+(i+j));
//			
//		}
		
		
		
		if(a instanceof Integer && b instanceof Integer) {
			Integer i=(Integer) a;
			Integer j=(Integer) b;
			System.out.println("adding Integer numbers "+(i+j));
		}
		
		
		if(a instanceof Float && b instanceof Float) {
			Float i=(Float) a;
			Float j=(Float) b;
			System.out.println("adding Float numbers "+(i+j));
		}
		
		
		if(a instanceof Double && b instanceof Double) {
			Double i=(Double) a;
			Double j=(Double) b;
			System.out.println("adding Double numbers "+(i+j));
		}
		
		
		if(a instanceof String && b instanceof String) {
			String i=(String) a;
			String j=(String) b;
			System.out.println("adding String values "+(i+j));
		}
		
	}

	
	
}

public class GenericsDemo {

	public static void main(String[] args) {
		
//		Generics<String> s=new Generics<String>("Anusha");
//		
//		System.out.println(s.getType());
//		
//		s.showType();
		
		
		Generics<Integer> i=new Generics<Integer>();
		Generics<Integer> i2=new Generics<Integer>();
		
		
		Generics<Float> f=new Generics<Float>();
		Generics<Float> f2=new Generics<Float>();
		
		
		Generics<Double> d=new Generics<Double>();
		Generics<Double> d2=new Generics<Double>();
		
		
		Generics<String> s2=new Generics<String>();
		
        i2.add(2,5);
        f2.add(20.87f,30.65f);
        d2.add(34.767, 55.888);
        
        s2.add("Anusha", "Basavaraj");
		
		
		
		
		

	}

}
