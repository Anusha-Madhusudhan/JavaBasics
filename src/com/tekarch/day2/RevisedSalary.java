package com.tekarch.day2;

import java.util.Scanner;

public class RevisedSalary {

	public static void main(String[] args) {

     double oldSalary3to5ye=20000.00;
     double oldSalary6to9ye=40000.00;
     double oldSalary10to20ye=60000.00;
     double oldSalaryOthers=80000.00;
     double revisedSalary;
     int rewardAmt=1000;
     
     Scanner scanner=new Scanner(System.in);
     
     System.out.println("Enter the experience :");
     
     int experience=scanner.nextInt();
     
     System.out.println("Is employee got reward? enter YES or NO:");
     
     String rew=scanner.next();
     
     boolean reward=false;
     
     if(rew.equals("YES")) {
    	 
    	 reward=true;
    	 
     }
     
     System.out.println(reward);
     
     
     if(experience>=3 && experience<=5) {
    	 
    	 revisedSalary=oldSalary3to5ye+(oldSalary3to5ye*10/100);
    	 if(reward) {
    		 revisedSalary+=rewardAmt;
    	 }
    	 System.out.println("Revised salary of empoyee is :" +revisedSalary);
    	 
     }
     else if(experience>=6 && experience<=9) {
    	 
    	 revisedSalary=oldSalary6to9ye+(oldSalary6to9ye*15/100);
    	 if(reward)
    		 revisedSalary+=rewardAmt;
    	 System.out.println("Revised salary of empoyee is :" +revisedSalary);
     }
     
     else if(experience>=10 && experience<=20) {
    	 
    	 revisedSalary=oldSalary10to20ye+(oldSalary10to20ye*20/100);
    	 if(reward)
    		 revisedSalary+=rewardAmt;
    	 System.out.println("Revised salary of empoyee is :" +revisedSalary);
     }
     
    else if(experience>20) {
    	 
    	 revisedSalary=oldSalaryOthers+(oldSalaryOthers*25/100);
    	 if(reward)
    		 revisedSalary+=rewardAmt;
    	 System.out.println("Revised salary of empoyee is :" +revisedSalary);
     }
     
     scanner.close();

	}

}
