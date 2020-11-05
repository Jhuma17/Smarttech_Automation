   package com.newcollections;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class NewStringCollections {

	    public static void compareValues() {
	   // compare values
	      String name = "Automation";
	      String name1 = "Automation";
	  //   System.out.println(name==name1);    //return true
	  // System.out.println(name.equals(name1));//return true
	
	      String name2 = new String("Automation");
	      String name3 = new String("Automation");
	      System.out.println(name2==name3);   // return false 
	      System.out.println(name2.equals(name3)); //return true
	}	
	
	   // remove extra space
	     public static void extraSpace1() {
	
	      String sentence = "  I   love   my   country   Bangladesh  ";
	    StringTokenizer st = new  StringTokenizer(sentence, " ");
	      StringBuffer sb = new  StringBuffer();
	     while(st.hasMoreElements()){
	        sb.append(st.nextElement()).append(" ");
	    
	 }  
	       System.out.println("Before removing space:" +sentence);
	     System.out.println("After removing space:" + sb.toString().trim());
	     
	  }	
	    
	     public static void extraSpace2() {
	 String sen = new String( "      Love Bangladesh  ");
	    System.out.println("String:" + sen);
	   System.out.println("Result after removing leading and trailing spaces:");
	   System.out.println(sen.trim());
	
	 }
	 
	      public static void evenNumber() {
	        int [] num = new int [] {10,13,14,15,20,25,34,50,55};
	        
	       for(int i = 0; i < num.length; i++) {
	     
	        if(num[i]%2 == 0) 
	         System.out.println(num[i] + " Is even number");
	        else  
	         System.out.println(num[i] + " Is odd number");
	      
  } }     
	      public static void  getDate() {
	          String days;
	        Date dt = new Date();
	        Calendar cl = Calendar.getInstance();
	           cl.setTime(dt);
	        System.out.println(dt);
	      
	         cl.add(Calendar.DAY_OF_YEAR, +20);
	         Date obj = cl.getTime();
	         SimpleDateFormat format = new  SimpleDateFormat("MM/dd/yyyy");
	         days= format.format(obj);
	         System.out.println("After date select:" + days);
	      
	 }      
	      public static void main(String[] args) {
		       //compareValues();
		       //extraSpace1();
		       // extraSpace2();
	    	   //evenNumber();
	    	      getDate();
	  
	  }

}
