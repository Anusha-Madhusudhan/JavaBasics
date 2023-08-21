package com.tekarch.AdvanceJavaDay1;

public class Q8_PangramDemo {

	public static void main(String[] args) {
		
		String s="Farmer jack realized that big yellow quilts were expensive";
		
		boolean flag = true;
		
		String s2=s.toLowerCase();
		
		for(char c='a';c<='z';c++) {
			if(!s2.contains(String.valueOf(c))) {
				flag=false;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Given String is not Pangram");
		}
		else {
			System.out.println("Given String is  Pangram");
		}

	}

}
