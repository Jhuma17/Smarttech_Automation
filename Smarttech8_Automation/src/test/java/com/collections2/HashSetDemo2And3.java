package com.collections2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2And3 {

	 public static void evenNumber() {
	   HashSet <Integer> set = new  HashSet<>();
	         set.add(10);
	         set.add(20);
	         set.add(30);
	         set.add(40);
	         System.out.println(set);    
	      
	       // addAll   
	   HashSet<Integer> numbers = new HashSet <>();
	      numbers.addAll(set);
	      numbers.add(50);
	   System.out.println("Hashset:" + numbers);//Hashset:[50, 20, 40, 10, 30]
	    
	      // removeAll ()
	   	   numbers.removeAll(set);
	   System.out.println("After removing:" +numbers);//After removing:[50]
	 }	   
	   
	   // declare the duplicate value
	  public static void duplicate() {
	    String nam [] = {"Jhuma","Mim","Shupti","Mim"};
	     Set <String> nm = new HashSet<>();
	     for(String j : nam) {
	     if(nm.add(j)== false) {
	    System.out.println("Duplicate value is :" +j);//Duplicate value is :Mim
   } }   
 }  
	   
	    public static void newHash() {
	     HashSet <Integer> set1 = new  HashSet<>();
	         set1.add(10);
	         set1.add(20);
	         set1.add(30);
	         set1.add(40);
	         System.out.println("Hashset1:" + set1);//Hashset1:[20, 40, 10, 30]
	        
	    HashSet <Integer> set2 = new  HashSet<>();
	         set2.add(10);
	         set2.add(20);
	         set2.add(30);
	      System.out.println("Hashset2:" + set2);//Hashset2:[20, 10, 30]
	  
	   // Union return unique  elements
             set1.addAll(set2);
	       System.out.println("Union:" + set1);//Union:[20, 40, 10, 30]
      
       // Difference return which objects are different
            //   set1.removeAll(set2);
            // System.out.println("Difference:" + set1);//Difference:[40]
	
	   //Intersection return common elements       
	      // set1.retainAll(set2);
	      // System.out.println("Intersection:" + set1);//Intersection:[20, 10, 30]
	    
	   // subset returns allthe elements from both set     
	      //  set1.containsAll(set2);
	      //  System.out.println("Subset:" + set1);////Subset:[20, 40, 10, 30]
   
	  //verifying set2 is a subset of set1 or not and it returns either true/false
	     System.out.println(set1.containsAll(set2)); //true,that means set2 is subset of set1
	  
}   
	  
	  
	      public static void main(String[] args) {
	    	 
	    	 evenNumber();
	    	  duplicate();
		      newHash();
	}
}
