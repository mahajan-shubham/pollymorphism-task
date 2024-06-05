package com.bank;

public class CurrentAccount extends Account {
	

	public CurrentAccount(int accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
		
	}
	void withdraw(double amt) {
		if(this.balance>=10000) {
			super.withdraw(amt);
		}
		else {
			System.out.println("Please maintain balance amount is minimum 10000.....sorry your withdraw amount is fail");
		}
	}
	@Override
	void displayAccountInfo() {
		super.displayAccountInfo();
		System.out.println("Thank you for transaction...!! Visit Again");
	}

}
