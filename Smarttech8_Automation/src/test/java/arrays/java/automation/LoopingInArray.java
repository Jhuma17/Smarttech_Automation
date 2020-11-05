 package arrays.java.automation;

import java.util.Arrays;
import java.util.List;

public class LoopingInArray {


         public static void forLoopTest() {
	    
  String [] nam = {"python","Rubi","Java","C++","C#","GitHub"};

         for(int i = 0; i < nam.length; i++ ) {
        System.out.println(i);
    }
 }

       public static void advanceLoopTest() {

   String [] nam = {"python","Rubi","Java","C++","C#","GitHub"};
  
         for (String j : nam) {
       System.out.println(j);
 }  }   
      
      public static void sortingLoop() {
      
   String [] nam = {"python","Rubi","Java","C++","C#","GitHub"};
          Arrays.sort(nam);
         for (String j : nam) {
        System.out.println("Arrays sorting :" + j);}
  
  }    
      public static void eachLoopTest() {
     
       List <String> nam = Arrays.asList("Maven","Selenium","Jetkins","Cucumber","TestNG");
      nam.forEach(n -> System.out.println(n));
     
  }     
     
      public static void loopIncreaseValue() {
     
        for(int i= 0;i < 11; i++) {
        System.out.println(i);
   } }  
      	
      public static void loopDecreaseValue() {
          
          for(int i= 20;i > 0; i--) {
          System.out.println(i);
     } }  
      
      public static void main(String[] args) {
		 forLoopTest();
       advanceLoopTest();
       eachLoopTest();
       sortingLoop();
       loopIncreaseValue();
       loopDecreaseValue();
     }
  }
     
     
     
     
