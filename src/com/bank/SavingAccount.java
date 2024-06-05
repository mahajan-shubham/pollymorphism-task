package com.bank;

public class SavingAccount extends Account{
	int withdrawlimit;
	int withdrawmade;

 public SavingAccount(int accountNumber, String accountHolder, int  balance,int withdrawlimit) {
 super(accountNumber, accountHolder, balance);
		this.withdrawlimit=0;
		this.withdrawmade=withdrawlimit;
	}
 @Override
 void withdraw(double amt) {
	 if(withdrawmade < withdrawlimit) {
		 super.withdraw(amt);
		 withdrawmade++;
	 }
	 else {
		 System.out.println("Your withdraw limit is cross");
	 }
 }
 void displayAccountInfo() {
	 super.displayAccountInfo();
	 System.out.println("withdraw limit = "+ this.withdrawmade);
 }

}
