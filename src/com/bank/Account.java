package com.bank;

public class Account {
 int accountNumber;
 String accountHolder;
 double balance;
 
public Account(int accountNumber, String accountHolder, double balance) {

	this.accountNumber = accountNumber;
	this.accountHolder = accountHolder;
	this.balance = balance;
}
 void deposit(double d) {
	  balance = balance +d;
	  //System.out.println("Thank you for deposite..!!, you amount is deposited successfully"+amt);   
 }
 void withdraw(double amt) {
	 if(amt<=balance) {
		 balance=balance-amt;
	 }
	 else {
		 System.out.println("Insufficient balance");
	 }
	 
 }
 void displayAccountInfo() {
	 
 	System.out.println("Account Holder = " + accountHolder);
 	System.out.println("Account number = " + accountNumber);
	System.out.println("current available balance : " + balance);
		
	}
public void deposite(double d) {
	// TODO Auto-generated method stub
	
}

 
}

