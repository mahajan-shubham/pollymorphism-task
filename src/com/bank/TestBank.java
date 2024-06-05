package com.bank;

public class TestBank {
	public static void main(String[] args) {
		 Account ac=new SavingAccount(123456647,"Raj",500000,3);
		 ac.deposit(5000.00);
		 System.out.println("---------------------------------");
		 ac.displayAccountInfo();
		 ac.withdraw(5000);
		 System.out.println("---------------------------------");
		 ac.displayAccountInfo();
		 ac.withdraw(2000);
		 System.out.println("----------------------------------");
		 ac.displayAccountInfo();
		 ac.withdraw(300);
		 System.out.println("----------------------------------");
		 
		 
	}

}
