package com.tekarch.Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class StackImplementation<T> {
	
	Object[] a=new Object[5];
	
//	T[] a=new T[5];
	
//	T[] a=(T[]) Array.newInstance(StackImplementation.class, 5);
	
	int pos;
	
	
	
	public StackImplementation() {
		this.pos=-1;
	}
	
	void push(T n) {
		
		if(pos<4) {
			a[++pos]=n;
		}else {
			System.out.println("Stack overflow...!!!");
		}
		
	}
	
	T pop() throws Exception {
		
		if(pos>-1) {
			return (T) a[pos--];
		}
		else {
			System.out.println("Stack underflow");
//			return 0;
			throw new Exception("Stack overflow...!");
		}
	}
	
	

	public static void main(String[] args)  {
		
		StackImplementation<String> s=new StackImplementation<String>();
		
		s.push("aaa");
		s.push("ccc");
		s.push("bbb");
		s.push("mmm");
		s.push("nnn");
		
		
//		s.push(12);
		
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
			System.out.println(s.pop());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("******************");
		
	
		

	}

}
