   package com.inheritence1;

   public class Credit1Account extends Checking1Account {

      protected void CreditDetails() {
   
    	Savings1Account.initialbalance = 14000;
    	Savings1Account.withdraw = 400;
    Savings1Account.balance = Savings1Account.initialbalance - Savings1Account.withdraw;
    
    System.out.println("Accountant total Credit Balance : " + balance);
   
   
   }

  }