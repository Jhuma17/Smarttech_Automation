   package com.inheritence1;

  public class Checking1Account extends Savings1Account {
  
	protected void checkingDetails() {
 
		Savings1Account.initialbalance = 1500;
		Savings1Account.deposits = 5000;
		Savings1Account. withdraw = 1200;
		Savings1Account.balance = Savings1Account.initialbalance + Savings1Account.deposits - 
				                    Savings1Account.withdraw;
		
	
	System.out.println("Accountant total Checking Balance : " + balance);

  
	}
 
  
 }