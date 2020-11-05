package com.newcollections;

  public class StringClassPractice {

	   public static void string1Test() {
           String color = "Black";
                  color = "Blue";
                  color = "Red";
	    System.out.println("Color name :" + color);//returns Red
    }	
	
	   public static void string2ConcatTest() {
	
	     String co = new  String ("Black");
	            co.concat("Blue");
	     System.out.println("Color name :" + co);//returns Black
	}
	    
	   public static void stringBufferTest() {
			
		     StringBuffer co = new  StringBuffer ("Black,");
		            co.append(" Blue,");
		            co.append(" Red");
		     System.out.println("Colors name:" + co);//Returns Black, Blue, Red
	}
	
	   public static void stringBuilderTest() {
			
		     StringBuilder co = new  StringBuilder ("Rose,");
		            co.append(" Lily,");
		            co.append(" SunFlower");
		     System.out.println("Flowers name :" + co);
	 }
	   public static void stringBufferReverse() {
	         String co = new String("NewYork");
	         String rev = new StringBuffer(co).reverse().toString();
	       System.out.println("Reverse the value :" + rev);//returns kroYweN
	 }
	   
	     public static void getCharacter() {
	      String co = new String("NewYork");
	      char ch = co.charAt(3);
	      System.out.println("Index of character is :" + ch);// returns Y
	  } 
	     
	     public static void compareString() {
	        String s1 = "Java";
	        String s2 = "Java";
	      // System.out.println(s1==s2);  // returns true
	    	System.out.println(s1.equals(s2)); 
	    	 
	   }  	 
	       public static void splitWord() {	 
	    	 String words = "I am a String class";
	    	 String [] wr = words.split("\\s");
	    	for(String w : wr) {
	    	 System.out.println(w);}
	   }  
	     
	       public static void getUpperlowerCase(){
	          String nm = new String("TestNG");
	          System.out.println(nm.toUpperCase());
	          System.out.println(nm.toLowerCase());
	       
	   }    
	       public static void main(String[] args) {
		         string1Test();
		         string2ConcatTest();
		         stringBufferTest();
		         stringBuilderTest();
		         stringBufferReverse();
		         getCharacter();
		         compareString();
		         splitWord();
		         getUpperlowerCase();
	  
	  }
}
