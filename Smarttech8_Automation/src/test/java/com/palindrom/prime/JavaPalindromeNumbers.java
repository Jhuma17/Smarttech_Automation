package com.palindrom.prime;

import java.util.Scanner;

public class JavaPalindromeNumbers {

	 public static void palindromeNumers() {
		
		Scanner sc = new Scanner(System.in);  //Scanner is a class
	    System.out.print("Enter a number: ");
	     
	     int num = sc.nextInt();    //(nextInt)this will accept the value and store it into the variable (num).
	      
	     int org_num = num;      //num=(accept from users)will be same as org_num & I willbe use org_num at the end of project
	    
	      int reverse = 0;        // now I will reverse the no.Initial I take reverse=0
	   
	   //reverse the no
	      while(num!=0) {            //(!=)means not equal this method will reverse the number
	    	 
	  reverse = reverse*10 + num%10;  // & finally this variable contains the reverse value
	     num = num /10;
	                 
	                          }                /*now i need to compare the reverse no with the original no.If
	                                           both are equal then i can say this no is Palindrome else not */      
	    //compare the no
	   if(org_num == reverse) {   
		   
	     System.out.println(org_num+"  Palindrome Number");
	   }
	
	   else {
		   
		 System.out.println(org_num + "  Not Palindrome Number ");
		 
	 } }
	
	      public static void palindromeString() {
	 
	       Scanner sn = new Scanner(System.in);
	    
	       System.out.println("Enter your String :");
	 
	       String str = sn.next();//Here whatever string i accept from user as(str),
	       
	       String original = str; //Same String i will stroe in a particular variable as(original).
	 
	    //Reverse String
	       String reverse ="";  //Here initially String is empty
	 
	      int length = str.length(); // finding the length of string
	      
	      for(int i = length-1; i >= 0; i--) { //Accordingly i need to get each and every character from the int 
	    	   
	    	 reverse =reverse + str.charAt(i); //this reverse variable contains the reverse string
	     
	      }
	      
	        //compare String  

	      if(original.equals(reverse)) {
	      
	    System.out.println(original + " is Palindrome String");  
	 }   
	 
	      else {  
	      
	     System.out.println(original + " is not a Palindrome"); 
	      
 }  }
	      
	      public static void main(String[] args) {
		   
	    	// palindromeNumers();
		     
		     palindromeString();
	 
	 
  } 
} 
 


