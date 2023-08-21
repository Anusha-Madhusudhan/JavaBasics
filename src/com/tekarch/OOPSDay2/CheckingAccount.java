package com.tekarch.OOPSDay2;

public class CheckingAccount extends BankAccount{

	@Override
	void deposit() {
		System.out.println("In side the deposite method of CheckingAccount class");
		
	}

	@Override
	void withdraw() {
		System.out.println("In side the withdraw method of CheckingAccount class");
		
	}

}
