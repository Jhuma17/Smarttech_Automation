  package com.inheritence1;

  public class Savings1Account {

       static String name;
       static int initialbalance;   // for printout in next line uses \n
       static int deposits;
       static int withdraw;
       static int balance;

   protected void openAccount() {

     name = " Mostofa Kamal" ;
    int id = 2017;
    String address = " 7608 Glenmore Ave,Queens";
    String dob = " 06/28/1978";
    int accNum =   37894112;
  String customer= name + " Accountant Id :" + id + " Accountant Address :" + address + 
		              "Date Of Birth :" + dob + "Account Number :" + accNum;
   
     System.out.println("Accountant Name :" + name);
     System.out.println("Account Number:"   +  accNum);
   
   }
   protected  void savingsDetails() {
       
	   initialbalance = 1500;
       deposits = 24000;
       withdraw = 1400;
   balance = initialbalance + deposits - withdraw ;
   System.out.println("Accountant Total Savings Balance :" + balance);
   }
   
  
  }  
   
   