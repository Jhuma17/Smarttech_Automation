package com.collections2;

public class BreakAndContinue {

       public static void breakValues() {
	// How to break the loop & continue	
         int i;
       for( i = 1; i<13;i++) { //here no should be bigger than(==)no
    	   System.out.println(i);
    	if(i==9)                      //How breaking the value on  position  
	    break;
	    
	}}
   
       public static void skipValues() {
         int k;
       for(k= 1; k<35; k++) { // How to skip the number,here no should be bigger than(==)no
            if(k==20) {
	    	continue;}
           System.out.println(k);}  
    }     

           public static void main(String[] args) {
        	  // breakValues();
        	   skipValues();
    
           
     }
} 