package com.tekarch.OOPSDay2;

public class SavingsAccount extends BankAccount implements Interest{

	@Override
	void deposit() {
		System.out.println("In side the deposite method of SavingsAccount class");
		
	}

	@Override
	void withdraw() {
		System.out.println("In side the withdraw method of SavingsAccount class");
		
	}

	@Override
	public void calculateInterest() {
		System.out.println("In side the calculateInterest method of SavingsAccount class");
		
	}

}
