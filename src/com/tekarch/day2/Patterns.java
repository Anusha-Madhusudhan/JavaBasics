package com.tekarch.day2;

public class Patterns {

	public static void main(String[] args) {

      for(int i=1;i<=5;i++) {
    	  
    	  for(int j=1;j<=5;j++) {
    		  System.out.print(j);
    	  }
    	  
    	  System.out.println();
      }
      
      System.out.println("***********");
      
      for(int i=1;i<=5;i++) {
    	  
    	  for(int j=1;j<=5;j++) {
    		  System.out.print(i);
    	  }
    	  
    	  System.out.println();
    	  
    	  
      }
      
      
      System.out.println("***********");
      
      for(int i=1;i<=5;i++) {
    	  
    	  for(int j=1;j<=i;j++) {
    		  System.out.print(j);
    	  }
    	  
    	  System.out.println();
    	  
    	  
      }
      
     System.out.println("***********");
      
      for(int i=0;i<5;i++) {
    	  
    	  for(int j=1;j<=5-i;j++) {
    		  System.out.print(j);
    	  }
    	  
    	  System.out.println();
    	  
    	  
      }
      
    System.out.println("***********");
    
    int space=4;
      
      for(int i=1;i<=5;i++) {
    	  
    	  for(int x=space;x>0;x--) {
			  
			  System.out.print(" ");
		  }
    		  
    	  for(int j=1;j<=i;j++) {
    		 
    		  
    		 
    		  System.out.print("* ");
    		  
    	  }
    	  space--;
    	  System.out.println();
    	  
    	  }
      
     int space2=1;
    	  
     for(int i=4;i>=1;i--) {
    	  
    	 for(int x=space2;x>0;x--) {
			  
			  System.out.print(" ");
		  }
    		  
    	  for(int j=1;j<=i;j++) {
    		 
    		  
    		 
    		  System.out.print("* ");
    		  
    	  }
    	  
         
    	  space2++;
    	  System.out.println();
    	  
    	  }
    	  
    	  
      }
      

	

}
