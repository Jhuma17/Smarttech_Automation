package com.palindrom.prime;

public class JavaPalindromeString {

	public static void main(String[] args) {
		
       // String original = "mom";      // reverse the leter one by one
        String original = "363";                           
		//String original = "race car"; //because of space outcome willbe not palindrome
		
		//original = original.replaceAll(" ", ""); //after replace space outcome will be palindrome,
		                                             //we have to take the result of this and
		
		String reverse = "";  //i want to build a String from scratch
	  
 /* the length I put(-1)because index started 0,then i>=0 which is start 0, i-- to go backwards 
  * my value length is(4),length[-1] means now value is(3),[i--]means reverses keep going (d-c-b-a)  */  
	    
	    
	    //reverse the value
	    for(int i = original.length()-1; i >= 0; i--) {  
	                                                                              
		 
		  reverse += original.charAt(i) ;  //i need to add reverse String with original String
	
	      System.out.println(reverse);
	 }
	
	     boolean palindrome = true;   //boolean return true/false
	
	  for(int i = 0; i < original.length(); i++ ) {       //here i < original length because org value 4 & i's value is 0
		  
	           System.out.println(i);
	  
	    //compare the value
	    if(original.charAt(i) != reverse.charAt(i)) {
	    	 palindrome = false;
	    }
 }
	
	   if(palindrome) {
		   System.out.println("Palindrome!");
	   }
	
	   else {
		   System.out.println("Not a palindrome!");
	   }
	
	}

}
