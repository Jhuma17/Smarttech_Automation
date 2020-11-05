  package com.newcollections;

  public class GroupStringPractice {

	  public static void string1() {
	     String flower = "Lily";
	            flower= "Rose";
	            flower=  "SunFlower";
	      System.out.println(flower);//return Sunflower
	     //System.out.println(flower.contains("SunFlower")); // return true 
	 }        
	
	    public static void getLength() {
	         String name = "Mostofa Kamal";
	         //System.out.println(name.length()); // return[13]
	        String name2 = name.replaceFirst("Kamal", "Jhuma");
              System.out.println(name2); // return Mostofa Jhuma
	    
	}    	
	    	public static void string2() {
	           String obj = "Apple";
	                  obj = "Mango";
	           obj.concat("Banana");
	   // System.out.println(obj);   //return Mango     
	      System.out.println(obj.contains("Apple"));  // return false 
   }
	   
	    	public static void concatTest() {
	    	   String fName = "Rabeya";
	    	   String lName = " Nafisa";
	    	String fullName = fName.concat(lName);
	           //System.out.println(fullName);      // return Rabeya Nafisa
	         System.out.println(fName.startsWith("R")); //return true
	         System.out.println(lName.endsWith("N")); // return false
	   }    	
	    	public static void stringBuffer() {
	    	 StringBuffer obj = new StringBuffer("Apple,");
	            obj.append(" Banana");
	         System.out.println(obj);//return Apple, Banana
	}	
	
	   public static void stringBuilder() {
	    	 StringBuilder obj = new StringBuilder("Apple,");
	            obj.append(" Banana");
	         System.out.println(obj);
	     
	  }     
	     
	   public static void stringReverse() {
	        String obj = new String("Jhuma");
	        String rev = new StringBuffer(obj).reverse().toString();
	       System.out.println(rev);
	   }   
	  
	    public static void upperAndLower() {
	   
	        String name = "Smarttech";
	        System.out.println(name.toUpperCase());
	        System.out.println(name.toLowerCase());
	  }	   
	   
	     public static void getSpecific() {
	     
	        char[] ch = {'J','h','u','m','a'};
	         System.out.println(ch);    // return Jhuma
	     
	  }     
	     
	     public static void getSpecificChar() {
	           String name = "Jhuma";
	            char ch1 = name.charAt(3);
	          System.out.println(ch1);    //return [m]
	     
  }     
	     public static void split() {
	    	 String word = " United States Of America";
	        String [] obj = word.split("\\s");
	        for(String w : obj){
	         System.out.println(w);
 }  }      
	   
	     public static void compare() {
	     String m1 = "Smarttech";
	     String m2 = "Smarttech";
	    System.out.println(m1==m2); 
	   System.out.println(m1.equals(m2)); } 
	    //if-else condition 
	   /*  if(m1==m2) {
	     System.out.println("true");}
	     else {                         // return true
	     System.out.println("false");
	   
	  }  */   
	     
	   public static void main(String[] args) {
	    //  string1();
	    // string2();
		//stringBuffer();
		//stringBuilder();
		//stringReverse();
		//upperAndLower();
		// getSpecific();
		// getSpecificChar();
		 //split();
		 //  compare();
		 getLength();
	       // concatTest();
	   
	   
	   }
  }
