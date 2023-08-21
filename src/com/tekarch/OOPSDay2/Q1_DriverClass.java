package com.tekarch.OOPSDay2;

public class Q1_DriverClass {

	public static void main(String[] args) {
		
		CheckingAccount ca=new CheckingAccount();
		SavingsAccount sa=new SavingsAccount();
		
		ca.deposit();
		ca.withdraw();
		
		sa.deposit();
		sa.withdraw();
		sa.calculateInterest();
		
		
		Interest interest=new SavingsAccount();  // creating the reference variable of Interest interface which holds the
		                                         // SavingsAccount class object.
		
		interest.calculateInterest(); 

	}

}
