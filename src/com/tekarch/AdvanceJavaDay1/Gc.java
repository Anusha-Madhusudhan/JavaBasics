package com.tekarch.AdvanceJavaDay1;

public class Gc {
	
	@Override
	protected void finalize() throws Throwable {
		
		//super.finalize();
		System.out.println("nnnnnnn");
	}

	public static void main(String[] args) {
		Gc i=new Gc();
		Gc i2=new Gc();
		
		i=null;
		i2=null;
		
		System.gc();
		

	}

}
