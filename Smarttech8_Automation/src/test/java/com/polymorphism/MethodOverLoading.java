package com.polymorphism;

public class MethodOverLoading {

     public void getName(String name,int age,int id) {  

      System.out.println();
    
     }


     public void getName(int age,int id,String name) {

    
     }

       
     public void getName(String name,String address,int id) {

     
     
     }
     
     
     
     
     public static void main(String[] args) {
	
    	   MethodOverLoading m = new MethodOverLoading();
    	      m.getName("(jhuma)", 35, 2018);
            
       
      }


}
