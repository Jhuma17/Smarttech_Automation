package com.newcollections;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class GroupStudy {

	    public static void reverse() {
	     String name = new String("Rayyan Kamal");
	    // String obj = new StringBuffer(name).reverse().toString();
	    // String name1 = name.replace('a','o');
	    // System.out.println(obj);	
	   //  System.out.println(name1);
	    //  System.out.println(name.toLowerCase());
	    //  System.out.println(name.toUpperCase());
	        System.out.println(name.length());
	    }	
	      public static void concat() {
	        String color = "Red";
	         String color1 ="Blue";
	       String color2 = color.concat(color1);
	       System.out.println(color2);
	     System.out.println(color.startsWith("R"));
	     System.out.println(color1.endsWith("E"));
	 }
	
	      public static void getSpecific() {
	    	char ch [] = {'S','a','d','i','a'};
	        //System.out.println(ch);
	      // String name = "Nafisa";
	      // char ch= name.charAt(3);
	      //System.out.println(ch);
	       
	  }
	
	       public static void split() {
	       String word = "I want to live Happily";
	       String [] wo = word.split("\\s");
	       for(String i : wo) {
	        System.out.println(i);
	    
	  } }    	   
	    	public static void compare() {  
	    	  String nam = new String ("Mostofa");
	    	  String nam1=new String ("Mostofa");
	    	  String nam2="Kamal";
	    	  String nam3="Kamal";
	    	  //System.out.println(nam2==nam3);
	         // System.out.println(nam2.equals(nam3));
	       if(nam2==nam3) 
	    	  System.out.print("true"); 
	    	  else {
	      System.out.println("false");
	      
	     }
	       
	}       
	        public static void stringBuffer() {
	    	    StringBuffer name = new StringBuffer ("Jhuma");
	    	       // name.append(" Akter");
	    	// System.out.println(name);
	         //System.out.println(name.reverse());
	         // System.out.println(name.delete(0, 4));
	    	     // name.setLength(3);
	    	   System.out.println(name);
  }    	
	    	public static void removeSpace() {
	        String line = "    Love   is   a    beautiful   feeling   ";
	     StringTokenizer st = new StringTokenizer(line + " ");  
	       StringBuffer bf = new StringBuffer();
	       while(st.hasMoreElements()) {
	         bf.append(st.nextElement()).append(" ");}
	        System.out.println(line);
            System.out.println(bf.toString().trim());
	   
	}        
	       public static void extraSpace() {
	       String line = new String("        Love is beautiful        ");
	    	System.out.println(line);
	    	System.out.println("after remove:");
	    	System.out.println(line.trim());
	       
	 }  	
	       public static void specialSign() {
	       String name = "#&Mostofa%&kamal%#****";
	       name = name.replaceAll("[^a-zA-z0-9]", " ");
	       System.out.println(name);
	       
	       String num = "1.23,45899";
	        num = num.replaceAll("\\W+", " ");
	        System.out.println(num);
   
	  }      
	      
	       public static void evenNumber() { 
	        int [] num = new int [] {1,2,3,4,5,6,7,8,9};
	       for(int i = 0;i<num.length;i++) {
	       if(num[i]%2==0) 
	    	System.out.println(num[i] + " is even number");
	       else
	        System.out.println(num[i] + " is odd number");
	       
	 } }     
	       public static void getDate() {
	         String days;
	        Date dat = new Date();
	        Calendar cal = Calendar.getInstance();
	        System.out.println(dat);
	       
	         cal.add(Calendar.DAY_OF_YEAR, +8);
	         Date obj = cal.getTime();
	         SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	         days=format.format(obj);
	         System.out.println(days);
	     
	   }       
	      
	         public static void getMonth() {
	               String days;
	            Date dt  = new Date();
	           Calendar cal = Calendar.getInstance();
	           System.out.println(dt);
	       
	            cal.add(Calendar.DAY_OF_WEEK_IN_MONTH, +3); // return 11/19/2020
	            Date obj = cal.getTime();
	            SimpleDateFormat mat = new SimpleDateFormat("MM/dd/yyyy");
	            days=mat.format(obj);
	            System.out.println(days);
	         
	 }     
	         
	         
	         
	         public static void main(String[] args) {
	           // reverse();
	    	  // concat();
	    	   //getSpecific();
	    	  //  split();
	    	   // compare();
	    	   //stringBuffer();
	    		//removeSpace();
	    		//extraSpace();
	    	   // specialSign();
	    	  // evenNumber();
	    	  //  getDate();
	    	   getMonth();
	       
	       }
}
