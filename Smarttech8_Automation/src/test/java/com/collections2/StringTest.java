 package com.collections2;

  public class StringTest {
     //immutable String class
	 public static void StringTest() {
        String name = "Smarttech";
	           name = "Inc";
	           name = "Jhuma";    // return new value
	           System.out.println(name);
  }
	 // immutable String class,concat method
	 public static void String1() {
	   String obj = new  String("UPS");
	          obj.concat("COMPANY"); //for concat method showing the before last value
	    System.out.println("I am a String class:" + obj);
  } 
	 // mutable StringBuffer class,all values 
	 public static void StringBuffer() {
		 StringBuffer obj = new  StringBuffer("UPS");
                      obj.append(" COMPANY");
                      obj.append(" NewYork");
                      System.out.println("I am a StringBuffer class:" + obj);
	 
  }  
	 //immutable StrinBuilder class,all values
	 public static void StringBuilder() {
		 StringBuilder obj = new  StringBuilder("DHL");
         obj.append(" COMPANY");
         obj.append(" NewYork");
         System.out.println("I am a StringBuilder class:" + obj);
	 
  }    
	   // how to reverse String
	   public static void StringBufferReverse() {
		 String obj = new  String("Smarttech");
         String rev = new  StringBuffer(obj).reverse().toString();
        System.out.println("Reverse the value:" + rev);
   } 
	  //how to get specific element
	    public static void getSpecificCar() {
	     String obj = new String("Smarttech");
	      char ch = obj.charAt(5);
	     System.out.println("Index number of char is a:" + ch);
   }   
	   // how to compare to String
	    public static void compareString() {
	      String s1 = "Selenium";
	      String s2 = "Selenium";
	      System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));
	
   }    
	   //how to split the word 
	    public static void splitWord() {
	    String word ="United State Of America";
	    String [] wd = word.split("\\s");
	    for(String w : wd) {
	    System.out.println(w);

 } }    	
	   //how to find out uppercase&lowercase letter
	    public static void upperAndLowerCase() {
	    String obj = new String("Smarttech");
	  System.out.println(obj.toLowerCase());
	   System.out.println(obj.toUpperCase());
	
	}    
	    public static void main(String[] args) {
		// StringTest();
		// String1();
		// StringBuffer();
		 //StringBuilder();
		// StringBufferReverse();
		 //getSpecificCar();
		// compareString();
		 splitWord() ;
		// upperAndLowerCase();
	   }
}