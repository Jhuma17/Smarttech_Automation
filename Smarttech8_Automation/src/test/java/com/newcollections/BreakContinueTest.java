package com.newcollections;

   public class BreakContinueTest {

	   public static void breakPractice() {
	   
	      int i;
	    for(i = 1; i < 18; i++) {
	    System.out.println(i);  
	    if(i == 9) {
	      break;
	  }    
 } }
	   public static void skipPractice() {
	   
	     int j;
	   for(j = 1; j < 11; j++) {
	    if(j == 7) {
	   continue;  } 
	  
	    System.out.println(j);
	  
	   }  }   
	   public static void main(String[] args) {
		      
		   //breakPractice();
		   skipPractice();

	}

}
