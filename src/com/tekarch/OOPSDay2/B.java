package com.tekarch.OOPSDay2;

public class B extends A{
	
	int c;

	public B(int a, int b,int c) {
		super(a, b);
		this.c=c;
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("inside display method of class B "+super.a +" "+super.b+"  "+c);
	}

}
